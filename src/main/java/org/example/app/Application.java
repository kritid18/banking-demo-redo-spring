package org.example.app;

import org.example.model.Customer;
import org.example.repository.CustomerRepositoryDB;
import org.example.repository.CustomerRepositoryStub;
import org.example.service.CustomerService;
import org.example.service.DefaultCustomerService;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        //CustomerRepositoryStub stubRepository = new CustomerRepositoryStub();

        CustomerService service = new DefaultCustomerService(newCustomerRepositorydb());

        List<Customer> customers = service.getAllCustomer();
       // List<Customer> customers = service.getAllCustomerWithStars();

        customers.forEach(System.out::println);
    }

    public static CustomerRepositoryDB newCustomerRepositorydb()
    {
        return new CustomerRepositoryDB();
    }

    public static CustomerRepositoryStub newCustomerRepositoryStub()
    {
        return new CustomerRepositoryStub();
    }
}
