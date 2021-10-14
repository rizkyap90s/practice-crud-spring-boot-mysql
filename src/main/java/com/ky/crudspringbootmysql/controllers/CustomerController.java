package com.ky.crudspringbootmysql.controllers;

import com.ky.crudspringbootmysql.models.entities.Customer;
import com.ky.crudspringbootmysql.services.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    
    @Autowired
    private  CustomerService customerService;

    @PostMapping
    public Customer create(@RequestBody Customer customer){
        return customerService.save(customer);
    }

    @GetMapping
    public Iterable<Customer> getCustomers(){
        return customerService.getCustomers();
    }

    @GetMapping("/{id}")
    public Customer findById(@PathVariable("id") Long id){
        return customerService.detailCustomer(id);
    }

    @PutMapping
    public Customer update(@RequestBody Customer customer){
        return customerService.save(customer);
    }

    @DeleteMapping("/{id}")
    public void removeById(@PathVariable("id") Long id){
        customerService.removeCustomer(id);
    }

}
