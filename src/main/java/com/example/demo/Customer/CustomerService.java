package com.example.demo.Customer;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CustomerService {

  private  List<Customer> customers= new ArrayList<>(Arrays.asList(
            new Customer("ankit","12321213",18,"active"),
            new Customer("amit","65675343",21,"active"),
            new Customer("aman","53532671",24,"inactive")
    ));


    public  List<Customer> getAllCustomer() {
        return customers;
    }
    public Customer  getCustomer(String id)
    {
       return customers.stream().filter(t->t.getId().equals(id)).findFirst().get();
    }


    public void addCustomer(Customer customer) {
     customers.add(customer);
    }

    public void updateCustomer(String id,Customer customer) {
        for(int i=0;i<customers.size();i++)
        {
            Customer c=customers.get(i);
            if(c.getId().equals(id)) {
                customers.set(i, customer);
                return;
            }

        }
    }

    public void deleteCustomer(String id) {
        customers.removeIf(t->t.getId().equals(id));
    }
}
