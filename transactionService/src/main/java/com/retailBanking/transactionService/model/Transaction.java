package com.retailBanking.transactionService.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transaction")
public class Transaction {

	@Id
	@Column(name="transactionid")
	private long transactionId;
	
	private double amount;

	private LocalDate date;
	
	private long accountNo;

	public Transaction() {
		
	}
	public Transaction(long transactionId, double amount, LocalDate date, long accountNo) {
		super();
		this.transactionId = transactionId;
		this.amount = amount;
		this.date = date;
		this.accountNo = accountNo;
	}
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
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", amount=" + amount + ", date=" + date + ", accountNo="
				+ accountNo + "]";
	}
	
}
