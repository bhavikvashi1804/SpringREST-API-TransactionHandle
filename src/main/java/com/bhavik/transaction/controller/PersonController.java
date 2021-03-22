package com.bhavik.transaction.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bhavik.transaction.model.Person;
import com.bhavik.transaction.service.TransactionService;

@RestController
public class PersonController {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	TransactionService service;

	@GetMapping("/personAPI")
	public ResponseEntity<Object> getAllPerson() {
		List<Person> personList = jdbcTemplate.query("SELECT * FROM PERSON", (rs) -> {
			List<Person> myList = new ArrayList<Person>();

			while (rs.next()) {
				Person p = new Person(rs.getInt("id"), rs.getString("name"), rs.getInt("balance"));
				myList.add(p);
			}

			return myList;
		});
		return new ResponseEntity(personList, HttpStatus.OK);

	}

	@GetMapping("/personAPI/{sId}/{rId}/{amount}")
	public ResponseEntity<Object> transferAmount(@PathVariable int sId, @PathVariable int rId,
			@PathVariable int amount) {

		service.doTransfer(sId, rId, amount);
		return new ResponseEntity("Transfer done", HttpStatus.OK);

	}
}
