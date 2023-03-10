package com.example.demo.Customer;

public class Customer {


    private String name;
    private int account_id;
    private int age;

    public Customer() {
    }

    public Customer(String name, int account_id, int age) {
        this.name = name;
        this.account_id = account_id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
