package com.amigoscode.controller;

import com.amigoscode.entity.Customer;
import com.amigoscode.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController (CustomerService customerService) {
        this.customerService=customerService;
    }
    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer){
        return customerService.createCustomer(customer);

    }
    @GetMapping
    public List<Customer> getCustomers(){
        return customerService.getCustomers();
    }
}
