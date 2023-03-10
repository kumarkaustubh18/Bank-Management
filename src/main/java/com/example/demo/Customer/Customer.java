package com.example.demo.Customer;

public class Customer {


    private String name;
    private String id;
    private int age;

    public Customer() {
    }

    public Customer(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
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

    public void setAccount_id(String account_id) {
        this.id = account_id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
