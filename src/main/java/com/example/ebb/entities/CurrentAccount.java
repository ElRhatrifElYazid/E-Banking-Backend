package com.example.ebb.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.NoArgsConstructor;
@Entity
@DiscriminatorValue("CA")
@Data  @NoArgsConstructor @AllArgsConstructor
public class CurrentAccount extends BankAccount{
    private  double overDraft;

}
