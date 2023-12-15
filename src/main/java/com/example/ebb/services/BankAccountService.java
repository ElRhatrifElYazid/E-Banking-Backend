package com.example.ebb.services;

import com.example.ebb.entities.BankAccount;
import com.example.ebb.entities.CurrentAccount;
import com.example.ebb.entities.Customer;
import com.example.ebb.entities.SavingAccount;
import com.example.ebb.exeptions.CustomerNotFoundException;

import java.util.List;
public interface BankAccountService {
    Customer saveCustomer(Customer customer);
    CurrentAccount saveCurrentBankAccount(double  initialBalance, double overDraft, Long customerId) throws CustomerNotFoundException;
    SavingAccount saveSavingBankAccount(double  initialBalance, double interestRate, Long customerId) throws CustomerNotFoundException;
    List<Customer> listCustomer();
    BankAccount getBankAccount(String accountId);
    void debit(String accountId,double amount,String description);
    void credit(String accountId,double amount,String description);
    void transfer(String accountIdSource,String accountIdDestination,double amount);
}
