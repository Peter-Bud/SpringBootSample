package com.example.springBootSample.custumer;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping(path = "api/v1/customer")
@RestController()
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(value = "all")
    List<Customer> getCustomers(){
         return customerService.getCustomers();
    }

    @GetMapping(path = "{customerId}")
    Customer getCustomer(@PathVariable("customerId")Long id) {
        return customerService.getCustomer(id);
    }


    @PostMapping
    void createNewCustomer(@Valid @RequestBody Customer customer){
        System.out.print(customer);
    }

    @PutMapping
    void updateCustomer(@RequestBody Customer customer){
        System.out.print(customer);
    }

    @DeleteMapping(path = "{customerId}")
    void deleteCustomer(@PathVariable("customerId") Long id){
        System.out.println(id + " User was deleted");
    }

}
