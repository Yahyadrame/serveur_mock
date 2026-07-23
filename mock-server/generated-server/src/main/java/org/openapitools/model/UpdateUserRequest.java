package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import org.openapitools.model.Address;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * UpdateUserRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-07-23T06:36:16.925756407Z[Africa/Dakar]", comments = "Generator version: 7.24.0")
public class UpdateUserRequest {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String firstName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String lastName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String phone;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String biography;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable URI photoUrl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Address address;

  public UpdateUserRequest firstName(@Nullable String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
   */
  @Size(min = 1, max = 100) 
  @Schema(name = "firstName", example = "Marie", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("firstName")
  public @Nullable String getFirstName() {
    return firstName;
  }

  @JsonProperty("firstName")
  public void setFirstName(@Nullable String firstName) {
    this.firstName = firstName;
  }

  public UpdateUserRequest lastName(@Nullable String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
   */
  @Size(min = 1, max = 100) 
  @Schema(name = "lastName", example = "Curie", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastName")
  public @Nullable String getLastName() {
    return lastName;
  }

  @JsonProperty("lastName")
  public void setLastName(@Nullable String lastName) {
    this.lastName = lastName;
  }

  public UpdateUserRequest phone(@Nullable String phone) {
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

  public UpdateUserRequest biography(@Nullable String biography) {
    this.biography = biography;
    return this;
  }

  /**
   * Get biography
   * @return biography
   */
  @Size(max = 2000) 
  @Schema(name = "biography", example = "Nouvelle biographie mise à jour.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("biography")
  public @Nullable String getBiography() {
    return biography;
  }

  @JsonProperty("biography")
  public void setBiography(@Nullable String biography) {
    this.biography = biography;
  }

  public UpdateUserRequest photoUrl(@Nullable URI photoUrl) {
    this.photoUrl = photoUrl;
    return this;
  }

  /**
   * Get photoUrl
   * @return photoUrl
   */
  @Valid 
  @Schema(name = "photoUrl", example = "https://example.com/photos/marie.jpg", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("photoUrl")
  public @Nullable URI getPhotoUrl() {
    return photoUrl;
  }

  @JsonProperty("photoUrl")
  public void setPhotoUrl(@Nullable URI photoUrl) {
    this.photoUrl = photoUrl;
  }

  public UpdateUserRequest address(@Nullable Address address) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUserRequest updateUserRequest = (UpdateUserRequest) o;
    return Objects.equals(this.firstName, updateUserRequest.firstName) &&
        Objects.equals(this.lastName, updateUserRequest.lastName) &&
        Objects.equals(this.phone, updateUserRequest.phone) &&
        Objects.equals(this.biography, updateUserRequest.biography) &&
        Objects.equals(this.photoUrl, updateUserRequest.photoUrl) &&
        Objects.equals(this.address, updateUserRequest.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, phone, biography, photoUrl, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserRequest {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    biography: ").append(toIndentedString(biography)).append("\n");
    sb.append("    photoUrl: ").append(toIndentedString(photoUrl)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

