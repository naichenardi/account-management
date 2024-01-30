package com.nardi.account.entities;


import com.nardi.account.enumeration.AccountType;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class BankingAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false, unique = true, name = "IBAN")
    private String accountNumber;

    @Column(nullable = false)
    private Double balance;

    @Column(nullable = false, unique = true)
    private String swiftCode;

    @Column(nullable = false, unique = true)
    private UUID userId;

    @Column(nullable = false)
    private AccountType accountType = AccountType.CURRENT;

    // getters and setters
    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public String getSwiftCode() {
        return swiftCode;
    }

    public void setSwiftCode(String swiftCode) {
        this.swiftCode = swiftCode;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}