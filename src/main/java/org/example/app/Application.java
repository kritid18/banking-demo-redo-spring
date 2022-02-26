package org.example.app;

import org.example.model.Customer;
import org.example.repository.CustomerRepositoryDB;
import org.example.repository.CustomerRepositoryStub;
import org.example.service.DefaultCustomerService;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        CustomerRepositoryStub stubRespository = new CustomerRepositoryStub();
        CustomerRepositoryDB dbRepository = new CustomerRepositoryDB();

        DefaultCustomerService service = new DefaultCustomerService(dbRepository);

       // List<Customer> customers = service.getAllCustomer();
        List<Customer> customers = service.getAllCustomerWithStars();

        customers.forEach(System.out::println);
    }
}
