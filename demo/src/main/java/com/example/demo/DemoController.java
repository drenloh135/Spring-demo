package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {

    @Autowired //Injecting new dependancy into this code haha whaaaat??
    private CustomerRepository customerRepository;

    @PostMapping("/add") //post request method
    public String addCustomer(@RequestParam String first, @RequestParam String last){
        Customer customer = new Customer();
        customer.setFirstName(first);
        customer.setLastName(last);
        //Using inbuilt repo method
        customerRepository.save(customer);
        return "Added new customer to Repo!";
    }

    @GetMapping("/list")
    public Iterable<Customer> getCustomers(){
        return customerRepository.findAll();
    }

    @GetMapping("/find/{id}")
    public Customer findCustomerById(@PathVariable Integer id){
        return customerRepository.findCustomerById(id);
    }
}
