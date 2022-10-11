package com.spring.springdeploy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Properties {

  @Value("${app.message}")
  private String message;

  public String getMessage() {
    return message;
  }
}
