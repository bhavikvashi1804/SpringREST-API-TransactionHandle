package com.bhavik.transaction.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhavik.transaction.model.Person;

@RestController
public class PersonController {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@GetMapping("/personAPI")
	public ResponseEntity<Object> getAllPerson() {
		List<Person> personList = Arrays.asList(new Person(101, "Bhavik", 15000), new Person(102, "Raj", 2000));
		return new ResponseEntity(personList, HttpStatus.OK);

	}
}
