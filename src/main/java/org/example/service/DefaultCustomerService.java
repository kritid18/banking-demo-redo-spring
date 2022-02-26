package org.example.service;

import org.example.model.Customer;
import org.example.repository.CustomerRepository;
import org.example.repository.CustomerRepositoryStub;

import java.util.List;
import java.util.stream.Collectors;

public class DefaultCustomerService {

    private CustomerRepository repository;

    //injecting repository using the constructor
    public DefaultCustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public List<Customer> getAllCustomer()
    {
        return repository.findAll();
    }

    public List<Customer> getAllCustomerWithStars()
    {
        return repository.findAll()
                .stream()
                .map(c -> new Customer(c.getId(), "****"+c.getName()+"****", c.getCity()))
                .collect(Collectors.toList());

    }

}
