package com.bhavik.transaction.exception;


public class InsufficientFund extends RuntimeException {

	public InsufficientFund(String message) {
		super(message);
	}
}
