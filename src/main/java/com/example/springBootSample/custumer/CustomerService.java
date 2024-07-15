package com.example.springBootSample.custumer;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@Component
public class CustomerService {
private final CustomerRepositories customerRepositories;

    public CustomerService(CustomerRepositories customerRepositories) {
        this.customerRepositories = customerRepositories;
    }

    List<Customer> getCustomers(){
        return customerRepositories.getCustomers();
    }

    Customer getCustomer(Long id){
        return getCustomers().
                stream().
                filter(customer -> customer.getId().equals(id)).
                findFirst().
                orElseThrow(() -> new IllegalStateException("customer not find"));
}}
