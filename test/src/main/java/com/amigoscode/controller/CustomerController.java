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
    @PutMapping
    public Customer updateCustomer(@RequestBody Customer customer){
        return customerService.updateCustomer(customer);
    }
    @DeleteMapping("/{id}")
    public Customer deleteCustomer(@PathVariable Integer id){
        Customer customerToDelete = new Customer(); // Create a new Customer object
        customerToDelete.setId(id);
        return customerService.deleteCustomer(customerToDelete);
    }
}
