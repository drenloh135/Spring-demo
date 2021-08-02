package com.example.demo;

import org.springframework.data.repository.CrudRepository;

//crudrepo works with Customer entities and Integer Ids
public interface CustomerRepository extends CrudRepository<Customer, Integer>{
    //JPA will derive a method by itself to find Customer using ID ... idk how even?
    Customer findCustomerById(Integer id);
}
