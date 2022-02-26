package org.example.service;

import org.example.model.Customer;
import org.example.repository.CustomerRepositoryDB;

import java.util.List;
import java.util.stream.Collectors;

public class DefaultCustomerService {

    private CustomerRepositoryDB repository = new CustomerRepositoryDB();

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
