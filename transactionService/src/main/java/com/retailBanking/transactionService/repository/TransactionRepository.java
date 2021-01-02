package com.retailBanking.transactionService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.retailBanking.transactionService.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Double>{

}
