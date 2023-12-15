package com.example.ebb.repositories;

import com.example.ebb.entities.BankAccount;
import com.example.ebb.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
