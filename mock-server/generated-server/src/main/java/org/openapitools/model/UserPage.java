package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.User;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * UserPage
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-07-23T06:36:16.925756407Z[Africa/Dakar]", comments = "Generator version: 7.24.0")
public class UserPage {

  private List<@Valid User> content = new ArrayList<>();

  private Integer page;

  private Integer size;

  private Integer totalElements;

  private Integer totalPages;

  private Boolean hasNext;

  private Boolean hasPrevious;

  public UserPage() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UserPage(List<@Valid User> content, Integer page, Integer size, Integer totalElements, Integer totalPages, Boolean hasNext, Boolean hasPrevious) {
    this.content = content;
    this.page = page;
    this.size = size;
    this.totalElements = totalElements;
    this.totalPages = totalPages;
    this.hasNext = hasNext;
    this.hasPrevious = hasPrevious;
  }

  public UserPage content(List<@Valid User> content) {
    this.content = content;
    return this;
  }

  public UserPage addContentItem(User contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<>();
    }
    this.content.add(contentItem);
    return this;
  }

  /**
   * Get content
   * @return content
   */
  @NotNull @Valid 
  @Schema(name = "content", example = "[{\"id\":\"123e4567-e89b-12d3-a456-426614174000\",\"keycloakId\":\"keycloak-abc-123\",\"email\":\"user1@example.com\",\"firstName\":\"Alice\",\"lastName\":\"Martin\",\"phone\":\"+33123456780\",\"photoUrl\":\"https://example.com/photos/alice.jpg\",\"biography\":\"Professeur de mathématiques.\",\"birthDate\":\"1975-03-20\",\"gender\":\"FEMALE\",\"type\":\"TEACHER\",\"status\":\"ACTIVE\",\"address\":{\"country\":\"France\",\"city\":\"Lyon\",\"street\":\"12 avenue des Champs\",\"postalCode\":\"69000\"},\"createdAt\":\"2022-01-01T10:00:00Z\",\"updatedAt\":\"2023-01-01T10:00:00Z\"},{\"id\":\"223e4567-e89b-12d3-a456-426614174001\",\"keycloakId\":\"keycloak-def-456\",\"email\":\"user2@example.com\",\"firstName\":\"Bob\",\"lastName\":\"Durand\",\"phone\":\"+33123456781\",\"photoUrl\":\"https://example.com/photos/bob.jpg\",\"biography\":\"Étudiant en informatique.\",\"birthDate\":\"1998-07-15\",\"gender\":\"MALE\",\"type\":\"STUDENT\",\"status\":\"ACTIVE\",\"address\":{\"country\":\"France\",\"city\":\"Marseille\",\"street\":\"5 rue de la République\",\"postalCode\":\"13000\"},\"createdAt\":\"2022-06-01T10:00:00Z\",\"updatedAt\":\"2023-06-01T10:00:00Z\"}]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("content")
  public List<@Valid User> getContent() {
    return content;
  }

  @JsonProperty("content")
  public void setContent(List<@Valid User> content) {
    this.content = content;
  }

  public UserPage page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * minimum: 0
   * @return page
   */
  @NotNull @Min(value = 0) 
  @Schema(name = "page", example = "0", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("page")
  public Integer getPage() {
    return page;
  }

  @JsonProperty("page")
  public void setPage(Integer page) {
    this.page = page;
  }

  public UserPage size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * minimum: 1
   * maximum: 100
   * @return size
   */
  @NotNull @Min(value = 1) @Max(value = 100) 
  @Schema(name = "size", example = "20", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }

  @JsonProperty("size")
  public void setSize(Integer size) {
    this.size = size;
  }

  public UserPage totalElements(Integer totalElements) {
    this.totalElements = totalElements;
    return this;
  }

  /**
   * Get totalElements
   * minimum: 0
   * @return totalElements
   */
  @NotNull @Min(value = 0) 
  @Schema(name = "totalElements", example = "2", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalElements")
  public Integer getTotalElements() {
    return totalElements;
  }

  @JsonProperty("totalElements")
  public void setTotalElements(Integer totalElements) {
    this.totalElements = totalElements;
  }

  public UserPage totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  /**
   * Get totalPages
   * minimum: 0
   * @return totalPages
   */
  @NotNull @Min(value = 0) 
  @Schema(name = "totalPages", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalPages")
  public Integer getTotalPages() {
    return totalPages;
  }

  @JsonProperty("totalPages")
  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  public UserPage hasNext(Boolean hasNext) {
    this.hasNext = hasNext;
    return this;
  }

  /**
   * Get hasNext
   * @return hasNext
   */
  @NotNull 
  @Schema(name = "hasNext", example = "false", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("hasNext")
  public Boolean getHasNext() {
    return hasNext;
  }

  @JsonProperty("hasNext")
  public void setHasNext(Boolean hasNext) {
    this.hasNext = hasNext;
  }

  public UserPage hasPrevious(Boolean hasPrevious) {
    this.hasPrevious = hasPrevious;
    return this;
  }

  /**
   * Get hasPrevious
   * @return hasPrevious
   */
  @NotNull 
  @Schema(name = "hasPrevious", example = "false", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("hasPrevious")
  public Boolean getHasPrevious() {
    return hasPrevious;
  }

  @JsonProperty("hasPrevious")
  public void setHasPrevious(Boolean hasPrevious) {
    this.hasPrevious = hasPrevious;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserPage userPage = (UserPage) o;
    return Objects.equals(this.content, userPage.content) &&
        Objects.equals(this.page, userPage.page) &&
        Objects.equals(this.size, userPage.size) &&
        Objects.equals(this.totalElements, userPage.totalElements) &&
        Objects.equals(this.totalPages, userPage.totalPages) &&
        Objects.equals(this.hasNext, userPage.hasNext) &&
        Objects.equals(this.hasPrevious, userPage.hasPrevious);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, page, size, totalElements, totalPages, hasNext, hasPrevious);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPage {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    hasNext: ").append(toIndentedString(hasNext)).append("\n");
    sb.append("    hasPrevious: ").append(toIndentedString(hasPrevious)).append("\n");
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

