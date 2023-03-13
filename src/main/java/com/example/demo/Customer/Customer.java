package com.example.demo.Customer;

public class Customer {


    private String name;
    private String id;
    private int age;

    private String account_Number;

    public Customer() {
    }



    public Customer(String name, String id, int age, String account_Number) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.account_Number=account_Number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getaccount_Number() {
        return account_Number;
    }

    public void setaccount_Number(String account_Number) {
        this.account_Number = account_Number;
    }
}
