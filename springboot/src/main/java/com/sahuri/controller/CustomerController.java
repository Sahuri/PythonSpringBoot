package com.sahuri.controller;

import com.sahuri.model.Customer;
import com.sahuri.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/all")
    public List<Customer> getAllCustomers() {
        return customerService.findAll();
    }

    @GetMapping("/{id}")
    public Customer getById(@PathVariable long id) {
        return customerService.findId(id);
    }

    @PostMapping("/save")
    public Customer Save(@RequestBody Customer product) {
        return customerService.save(product);
    }

    @PutMapping("/update")
    public Customer update(@RequestBody Customer product) {
        return customerService.update(product);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable long id) {
        return customerService.delete(id);
    }
}
