package com.chueric.mybank;

/**
 * Created by Eric on 12/4/15.
 */
public class BankAccount {
    /*
        variable names that are non-public/non-static start with 'm'
        variable names that are static start with 's'
        public static final names are in all caps with underscores
    */
    private static final String TAG = "BankAccount";
    private double mbalance;

    //this applies to all BankAccount classes and can't be changed but can be accessed
    public static final double OVERDRAFT_FEE = 30;

    public void withdraw(double amount) {
        if (mbalance - amount < 0) {
            mbalance -= (amount + OVERDRAFT_FEE);
        }
        else {
            mbalance -= amount;
        }
    }

    public void deposit(double amount) {
        mbalance += amount;
    }

    public double getBalance() {
        return this.mbalance;
    }
}
