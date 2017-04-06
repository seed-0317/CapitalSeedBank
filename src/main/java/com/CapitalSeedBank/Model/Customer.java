package com.CapitalSeedBank.Model;

/**
 * Created by njb917 on 4/6/17.
 */
public class Customer {
        private String customerName;
        private int accountId;

    public Customer(String customerName, int accountId) {
        this.customerName = customerName;
        this.accountId = accountId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
}


