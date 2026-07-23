package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.net.URI;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.openapitools.model.Address;
import org.openapitools.model.Gender;
import org.openapitools.model.UserStatus;
import org.openapitools.model.UserType;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * User
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-07-23T06:36:16.925756407Z[Africa/Dakar]", comments = "Generator version: 7.24.0")
public class User {

  private UUID id;

  private String keycloakId;

  private String email;

  private String firstName;

  private String lastName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String phone;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable URI photoUrl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String biography;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private @Nullable LocalDate birthDate;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Gender gender;

  private UserType type;

  private UserStatus status;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Address address;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime updatedAt;

  public User() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public User(UUID id, String keycloakId, String email, String firstName, String lastName, UserType type, UserStatus status, OffsetDateTime createdAt) {
    this.id = id;
    this.keycloakId = keycloakId;
    this.email = email;
    this.firstName = firstName;
    this.lastName = lastName;
    this.type = type;
    this.status = status;
    this.createdAt = createdAt;
  }

  public User id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @NotNull @Valid 
  @Schema(name = "id", example = "123e4567-e89b-12d3-a456-426614174000", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public UUID getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(UUID id) {
    this.id = id;
  }

  public User keycloakId(String keycloakId) {
    this.keycloakId = keycloakId;
    return this;
  }

  /**
   * Get keycloakId
   * @return keycloakId
   */
  @NotNull @Size(min = 1, max = 255) 
  @Schema(name = "keycloakId", example = "keycloak-abc-123", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("keycloakId")
  public String getKeycloakId() {
    return keycloakId;
  }

  @JsonProperty("keycloakId")
  public void setKeycloakId(String keycloakId) {
    this.keycloakId = keycloakId;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   */
  @NotNull @jakarta.validation.constraints.Email 
  @Schema(name = "email", example = "user@example.com", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  @JsonProperty("email")
  public void setEmail(String email) {
    this.email = email;
  }

  public User firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
   */
  @NotNull @Size(min = 1, max = 100) 
  @Schema(name = "firstName", example = "Jean", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  @JsonProperty("firstName")
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public User lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
   */
  @NotNull @Size(min = 1, max = 100) 
  @Schema(name = "lastName", example = "Dupont", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  @JsonProperty("lastName")
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public User phone(@Nullable String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
   */
  @Pattern(regexp = "^\\+?[1-9]\\d{7,14}$") 
  @Schema(name = "phone", example = "+33123456789", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("phone")
  public @Nullable String getPhone() {
    return phone;
  }

  @JsonProperty("phone")
  public void setPhone(@Nullable String phone) {
    this.phone = phone;
  }

  public User photoUrl(@Nullable URI photoUrl) {
    this.photoUrl = photoUrl;
    return this;
  }

  /**
   * Get photoUrl
   * @return photoUrl
   */
  @Valid 
  @Schema(name = "photoUrl", example = "https://example.com/photos/jean.jpg", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("photoUrl")
  public @Nullable URI getPhotoUrl() {
    return photoUrl;
  }

  @JsonProperty("photoUrl")
  public void setPhotoUrl(@Nullable URI photoUrl) {
    this.photoUrl = photoUrl;
  }

  public User biography(@Nullable String biography) {
    this.biography = biography;
    return this;
  }

  /**
   * Get biography
   * @return biography
   */
  @Size(max = 2000) 
  @Schema(name = "biography", example = "Ancien élève passionné par l'informatique.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("biography")
  public @Nullable String getBiography() {
    return biography;
  }

  @JsonProperty("biography")
  public void setBiography(@Nullable String biography) {
    this.biography = biography;
  }

  public User birthDate(@Nullable LocalDate birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * Get birthDate
   * @return birthDate
   */
  @Valid 
  @Schema(name = "birthDate", example = "1980-05-15", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("birthDate")
  public @Nullable LocalDate getBirthDate() {
    return birthDate;
  }

  @JsonProperty("birthDate")
  public void setBirthDate(@Nullable LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public User gender(@Nullable Gender gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
   */
  @Valid 
  @Schema(name = "gender", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gender")
  public @Nullable Gender getGender() {
    return gender;
  }

  @JsonProperty("gender")
  public void setGender(@Nullable Gender gender) {
    this.gender = gender;
  }

  public User type(UserType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @NotNull @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public UserType getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(UserType type) {
    this.type = type;
  }

  public User status(UserStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @NotNull @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public UserStatus getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(UserStatus status) {
    this.status = status;
  }

  public User address(@Nullable Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  @Valid 
  @Schema(name = "address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address")
  public @Nullable Address getAddress() {
    return address;
  }

  @JsonProperty("address")
  public void setAddress(@Nullable Address address) {
    this.address = address;
  }

  public User createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @NotNull @Valid 
  @Schema(name = "createdAt", example = "2023-01-01T12:00Z", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("createdAt")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  @JsonProperty("createdAt")
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public User updatedAt(@Nullable OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
   */
  @Valid 
  @Schema(name = "updatedAt", example = "2023-06-01T15:30Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updatedAt")
  public @Nullable OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  @JsonProperty("updatedAt")
  public void setUpdatedAt(@Nullable OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.keycloakId, user.keycloakId) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.firstName, user.firstName) &&
        Objects.equals(this.lastName, user.lastName) &&
        Objects.equals(this.phone, user.phone) &&
        Objects.equals(this.photoUrl, user.photoUrl) &&
        Objects.equals(this.biography, user.biography) &&
        Objects.equals(this.birthDate, user.birthDate) &&
        Objects.equals(this.gender, user.gender) &&
        Objects.equals(this.type, user.type) &&
        Objects.equals(this.status, user.status) &&
        Objects.equals(this.address, user.address) &&
        Objects.equals(this.createdAt, user.createdAt) &&
        Objects.equals(this.updatedAt, user.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, keycloakId, email, firstName, lastName, phone, photoUrl, biography, birthDate, gender, type, status, address, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    keycloakId: ").append(toIndentedString(keycloakId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    photoUrl: ").append(toIndentedString(photoUrl)).append("\n");
    sb.append("    biography: ").append(toIndentedString(biography)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

