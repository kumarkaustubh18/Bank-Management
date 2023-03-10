package com.example.demo.Customer;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CustomerService {

  private  List<Customer> customers= Arrays.asList(
            new Customer("ankit","12321213",18),
            new Customer("amit","65675343",21),
            new Customer("aman","53532671",24)
    );


    public  List<Customer> getAllCustomer() {
        return customers;
    }
    public Customer  getCustomer(String id)
    {
       return customers.stream().filter(t->t.getId().equals(id)).findFirst().get();
    }
}
