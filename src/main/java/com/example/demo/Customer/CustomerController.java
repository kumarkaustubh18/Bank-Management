package com.example.demo.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CustomerController {

     @Autowired
    private CustomerService customerService;

    @RequestMapping("/customer")
    public List<Customer> getAllCustomer()
    {
        return customerService.getAllCustomer();
    }

    @RequestMapping("/customer/{id}")
    public Customer getCustomer(@PathVariable String id)
    {
     return customerService.getCustomer(id);
    }
}

