package com.example.ebb.services;

import com.example.ebb.entities.BankAccount;
import com.example.ebb.entities.CurrentAccount;
import com.example.ebb.entities.SavingAccount;
import com.example.ebb.repositories.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BankService {
    @Autowired
    private BankAccountRepository bankAccountRepository;
    public void consulter(){
        BankAccount bankAccount=bankAccountRepository.findById("00703c4d-f54b-425c-a5ff-8c5c6928fa1d").orElse(null);
        if(bankAccount!=null) {
            System.out.println("*********************");
            System.out.println(bankAccount.getId());
            System.out.println(bankAccount.getBalance());
            System.out.println(bankAccount.getStatus());
            System.out.println(bankAccount.getCreatedAt());
            System.out.println(bankAccount.getCustomer().getName());
            System.out.println(bankAccount.getClass().getSimpleName());
            if (bankAccount instanceof CurrentAccount) {
                System.out.println("Over Draft =>" + ((CurrentAccount) bankAccount).getOverDraft());
            } else if (bankAccount instanceof SavingAccount) {
                System.out.print("Rate =>" + ((SavingAccount) bankAccount).getInterestRate());

            }
            bankAccount.getAccountOperations().forEach(op -> {
                System.out.println(op.getType() + "\t" + op.getOperationDate() + "\t" + op.getAmount());
            });
        }
    }
}

