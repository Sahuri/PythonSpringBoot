package com.sahuri.service;

import com.sahuri.model.Customer;

import java.util.List;

public interface CustomerService {
    Customer findId(long id);
    List<Customer> findAll();
    boolean delete(long id);
    Customer update(Customer product);
    Customer save(Customer product);
}
