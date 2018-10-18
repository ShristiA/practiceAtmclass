package com.company;

public class AtmClass {
    private int accountNum ;
    private String userName;
    private int pin;
    private double balance;

    public AtmClass() {

    }

    public AtmClass(int accountNum, String userName, int pin, double balance) {
        this.accountNum = accountNum;
        this.userName = userName;
        this.pin = pin;
        this.balance = balance;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
