package com.retailBanking.accountsService.model;

import java.time.LocalDate;

public class Transaction {
	
	private long transactionId;
	private double amount;
	private LocalDate date;
	
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Transaction(long transactionId, double amount, LocalDate date) {
		super();
		this.transactionId = transactionId;
		this.amount = amount;
		this.date = date;
		
	}
//	public Transaction(double amount, LocalDate date) {
//		super();
//		this.amount = amount;
//		this.date = date;
//		
//	}
	
	public long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

//	@Override
//	public String toString() {
//		return "Transaction [amount=" + amount + ", date=" + date + "]";
//	}

	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", amount=" + amount + ", date=" + date + "]";
	}
	
	
	}