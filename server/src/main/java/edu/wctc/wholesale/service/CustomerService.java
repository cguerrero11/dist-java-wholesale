package edu.wctc.wholesale.service;

import edu.wctc.wholesale.entity.Customer;

import java.util.List;

public interface CustomerService {
    Customer getCustomer(int customerId);

    List<Customer> getCustomerList();
}
