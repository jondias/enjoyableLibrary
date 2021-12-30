package com.tui.enjoy.enjoyableLibrary.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class AppExceptionHandler {

  @ExceptionHandler(Exception.class)
  public ResponseEntity<?> globleExcpetionHandler(final Exception ex, final WebRequest request) {
    return new ResponseEntity<>("An error occurred, please try again later."+ ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
  }
}
