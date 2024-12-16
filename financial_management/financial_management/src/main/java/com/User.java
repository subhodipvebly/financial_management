package com;

public class User {
    private String date;
    private String name;
    private double balance;
    public User(String date,String name,double balance)
    {
        this.date=date;
        this.name=name;
        this.balance=balance;
    }
    public String getDate() {
        return date;
    }
    public String getName() {
        return name;
    }
    public double getBalance() {
        return balance;
    }
    @Override
    public String toString()
    {
        return "User{" +
        "date='" + date + '\'' +
        ", name='" + name + '\'' +
        ", balance=" + balance +
        '}';
    }
}
