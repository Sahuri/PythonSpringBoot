package com.sahuri.service;

import com.sahuri.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import com.sahuri.repository.CustomerRepository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer findId(long id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public List<Customer> findAll() {
        return StreamSupport.stream(customerRepository.findAll()
                .spliterator(),false).collect(Collectors.toList());
    }

    @Override
    public Customer save(Customer product) {
        return customerRepository.save(product);
    }
    @Override
    public Customer update(Customer product) {
        return customerRepository.save(product);
    }

    @Override
    public boolean delete(long id) {
        Customer product=findId(id);
        if(product!=null){
            customerRepository.delete(product);
            return true;
        }
        return false;
    }

}
