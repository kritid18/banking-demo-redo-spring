package org.example.repository;

import org.example.model.Customer;

import java.util.List;

import static java.util.Arrays.asList;

public class CustomerRepositoryStub implements CustomerRepository{

    public List<Customer> findAll()
    {
        return asList(
                new Customer("1", "Twinkle", "Lucknow"),
                new Customer("2", "Simran", "Lucknow"),
                new Customer("3", "Gaurika", "Dehradun"));
    }
}
