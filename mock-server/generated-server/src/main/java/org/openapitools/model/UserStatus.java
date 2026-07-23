package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets UserStatus
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-07-23T06:36:16.925756407Z[Africa/Dakar]", comments = "Generator version: 7.24.0")
public enum UserStatus {
  
  ACTIVE("ACTIVE"),
  
  INACTIVE("INACTIVE"),
  
  SUSPENDED("SUSPENDED");

  private final String value;

  UserStatus(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static UserStatus fromValue(String value) {
    for (UserStatus b : UserStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

