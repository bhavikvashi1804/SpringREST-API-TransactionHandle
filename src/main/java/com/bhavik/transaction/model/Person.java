package com.bhavik.transaction.model;

public class Person {

	// properties
	private int id;
	private String name;
	private int balance;

	// getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	// constructor
	public Person() {

	}

	public Person(int id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
}
