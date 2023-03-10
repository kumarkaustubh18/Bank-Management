package com.example.demo.Customer;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CustomerService {

  private  List<Customer> customer= Arrays.asList(
            new Customer("ankit",12321213,18),
            new Customer("amit",65675343,21),
            new Customer("aman",53532671,24)
    );


    public  List<Customer> getAllCustomer() {
        return customer;
    }
}
