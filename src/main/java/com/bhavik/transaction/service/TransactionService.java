package com.bhavik.transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public boolean doTransfer(int sId, int rId, int amount) {
		System.out.println("Sender Id: "+sId);
		System.out.println("Reciever Id: "+rId);
		System.out.println("Amount: "+amount);
		
		
		
		return true;
	}

}
