package com.ky.crudspringbootmysql.services;

import java.util.List;

import javax.transaction.Transactional;

import com.ky.crudspringbootmysql.models.entities.Customer;
import com.ky.crudspringbootmysql.models.repositories.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
    
    public Customer save(Customer customer){
        return customerRepository.save(customer);
    }
     
    public Customer detailCustomer(Long id){
        return customerRepository.findById(id).get();
    }

    public Iterable<Customer> getCustomers(){
        return customerRepository.findAll();
    }

    public void removeCustomer(Long id){
        customerRepository.deleteById(id);
    }

    public List<Customer> getCustomerByName(String name){
        return customerRepository.findByNameContains(name);
    }
}
