package com.ky.crudspringbootmysql.models.repositories;

import com.ky.crudspringbootmysql.models.entities.Customer;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    
    List<Customer> findByNameContains(String name);
}
