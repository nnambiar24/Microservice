package com.retailBanking.transactionService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.retailBanking.transactionService.model.Transaction;
import com.retailBanking.transactionService.service.TransactionService;

@RestController
public class TransactionController {

	@Autowired
	private TransactionService service;
	
	@GetMapping("account/transaction")
	public List<Transaction> getAllTransaction(){
		return service.fetchAllTransaction();
	}
	
	@GetMapping(value="account/{accountNo}",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Transaction> getTransactionByAccount(@PathVariable("accountNo") long no){
		System.out.println("Entered");
//		List<Transaction> transaction = new TransactionList();
		List<Transaction> transaction = service.fetchTransactionByAccount(no);
//		transaction.setTransaction(tr);
//		System.out.println("output in transactionservcie:"+transaction.getTransaction());
		return transaction;
	}
}
