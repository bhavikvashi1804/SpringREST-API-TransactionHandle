package com.bhavik.transaction.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.EXPECTATION_FAILED, reason = "Cuurent Balance < Transaction Amount")
public class InsufficientFund extends RuntimeException {

	public InsufficientFund(String message) {
		super(message);
	}
}
