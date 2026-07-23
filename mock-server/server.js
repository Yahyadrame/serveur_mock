const express = require('express');
const cors = require('cors');
const swaggerUi = require('swagger-ui-express');
const YAML = require('yamljs');
const path = require('path');
const crypto = require('crypto');

const app = express();
app.use(cors());
app.use(express.json());

const swaggerDocument = YAML.load(path.join(__dirname, 'openapi.yaml'));
app.use('/docs', swaggerUi.serve, swaggerUi.setup(swaggerDocument));

// ---- In-memory data store, seeded from the examples in the spec ----
let users = [
  {
    id: '123e4567-e89b-12d3-a456-426614174000',
    keycloakId: 'keycloak-abc-123',
    email: 'user1@example.com',
    firstName: 'Alice',
    lastName: 'Martin',
    phone: '+33123456780',
    photoUrl: 'https://example.com/photos/alice.jpg',
    biography: 'Professeur de mathématiques.',
    birthDate: '1975-03-20',
    gender: 'FEMALE',
    type: 'TEACHER',
    status: 'ACTIVE',
    address: { country: 'France', city: 'Lyon', street: '12 avenue des Champs', postalCode: '69000' },
    createdAt: '2022-01-01T10:00:00Z',
    updatedAt: '2023-01-01T10:00:00Z',
  },
  {
    id: '223e4567-e89b-12d3-a456-426614174001',
    keycloakId: 'keycloak-def-456',
    email: 'user2@example.com',
    firstName: 'Bob',
    lastName: 'Durand',
    phone: '+33123456781',
    photoUrl: 'https://example.com/photos/bob.jpg',
    biography: 'Étudiant en informatique.',
    birthDate: '1998-07-15',
    gender: 'MALE',
    type: 'STUDENT',
    status: 'ACTIVE',
    address: { country: 'France', city: 'Marseille', street: '5 rue de la République', postalCode: '13000' },
    createdAt: '2022-06-01T10:00:00Z',
    updatedAt: '2023-06-01T10:00:00Z',
  },
];

const currentUser = users[0]; // used to mock /users/me

function errorResponse(res, status, message, path) {
  return res.status(status).json({
    timestamp: new Date().toISOString(),
    status,
    message,
    path,
  });
}

// ---- POST /users & GET /users ----
app.post('/users', (req, res) => {
  const body = req.body || {};
  if (!body.keycloakId || !body.email || !body.firstName || !body.lastName) {
    return errorResponse(res, 400, 'Champs obligatoires manquants', '/users');
  }
  if (users.some((u) => u.email === body.email)) {
    return errorResponse(res, 409, 'Utilisateur déjà existant', '/users');
  }
  const newUser = {
    id: crypto.randomUUID(),
    keycloakId: body.keycloakId,
    email: body.email,
    firstName: body.firstName,
    lastName: body.lastName,
    phone: body.phone,
    type: body.type || 'STUDENT',
    status: 'ACTIVE',
    address: body.address,
    createdAt: new Date().toISOString(),
  };
  users.push(newUser);
  res.status(201).json(newUser);
});

app.get('/users', (req, res) => {
  const { name, email, type, page = 0, size = 20 } = req.query;
  let filtered = users;
  if (name) {
    const n = name.toLowerCase();
    filtered = filtered.filter(
      (u) => u.firstName.toLowerCase().includes(n) || u.lastName.toLowerCase().includes(n)
    );
  }
  if (email) filtered = filtered.filter((u) => u.email === email);
  if (type) filtered = filtered.filter((u) => u.type === type);

  const p = parseInt(page, 10) || 0;
  const s = parseInt(size, 10) || 20;
  const content = filtered.slice(p * s, p * s + s);

  res.status(200).json({
    content,
    page: p,
    size: s,
    totalElements: filtered.length,
    totalPages: Math.max(1, Math.ceil(filtered.length / s)),
    hasNext: (p + 1) * s < filtered.length,
    hasPrevious: p > 0,
  });
});

// ---- /users/me (declared BEFORE /users/:userId so "me" isn't parsed as a UUID) ----
app.get('/users/me', (req, res) => {
  res.status(200).json(currentUser);
});

app.patch('/users/me', (req, res) => {
  Object.assign(currentUser, req.body, { updatedAt: new Date().toISOString() });
  res.status(200).json(currentUser);
});

// ---- /users/{userId} ----
app.get('/users/:userId', (req, res) => {
  const user = users.find((u) => u.id === req.params.userId);
  if (!user) return errorResponse(res, 404, 'Ressource introuvable', req.originalUrl);
  res.status(200).json(user);
});

app.patch('/users/:userId', (req, res) => {
  const user = users.find((u) => u.id === req.params.userId);
  if (!user) return errorResponse(res, 404, 'Ressource introuvable', req.originalUrl);
  Object.assign(user, req.body, { updatedAt: new Date().toISOString() });
  res.status(200).json(user);
});

app.delete('/users/:userId', (req, res) => {
  const index = users.findIndex((u) => u.id === req.params.userId);
  if (index === -1) return errorResponse(res, 404, 'Ressource introuvable', req.originalUrl);
  users.splice(index, 1);
  res.status(204).send();
});

app.get('/', (req, res) => {
  res.json({ message: 'Alumni Platform - User Service mock server', docs: '/docs' });
});

const PORT = process.env.PORT || 8080;
app.listen(PORT, () => {
  console.log(`Mock server listening on port ${PORT}`);
  console.log(`Swagger UI: http://localhost:${PORT}/docs`);
});
