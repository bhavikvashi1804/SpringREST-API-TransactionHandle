package com.bhavik.transaction.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponseEntityExceptionHandler {

	@ExceptionHandler({ InsufficientFund.class })
	public ResponseEntity<Object> handleInsufficientFundIn(InsufficientFund e) {
		System.out.println("This is external Handler");
		return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler({ RuntimeException.class })
	public ResponseEntity<Object> handleAllException(RuntimeException e) {
		return new ResponseEntity("Something went wrong", HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
