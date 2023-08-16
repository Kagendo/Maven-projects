package com.amigoscode.service;

import com.amigoscode.entity.Customer;

import java.util.List;

public interface CustomerService {
    Customer createCustomer(Customer customer);
    List<Customer> getCustomers();
    Customer updateCustomer(Customer customer);
    Customer deleteCustomer(Customer customer);


}
