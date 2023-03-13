package com.example.demo.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(method = RequestMethod.POST,value="/customer")
    public void addCustomer(@RequestBody Customer customer)
    {
     customerService.addCustomer(customer);
    }
}

