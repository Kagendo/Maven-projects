package com.amigoscode.service.impl;

import com.amigoscode.entity.Customer;
import com.amigoscode.repository.CustomerRepository;
import com.amigoscode.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

   @Override
    public Customer createCustomer(Customer customer) {

        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }
    public Customer updateCustomer(Customer customer){
        Customer existingCustomer = customerRepository.findById(customer.getId())
                .orElseThrow(() -> new RuntimeException("Customer not found"));
        existingCustomer.setName(customer.getName());
        existingCustomer.setAge(customer.getAge());
        existingCustomer.setLocation(customer.getLocation());
        return customerRepository.save(existingCustomer);
    }

    public Customer deleteCustomer(Customer customer){
        Customer existingCustomer = customerRepository.findById(customer.getId())
                .orElseThrow(() -> new RuntimeException("Customer not found"));
        customerRepository.delete(existingCustomer);
        return existingCustomer;
    }

}
