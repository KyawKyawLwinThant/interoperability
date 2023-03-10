package com.example.customersevice.controller;


import com.example.customersevice.dao.CustomerDao;
import com.example.customersevice.ds.Customers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerDao customerDao;

    @GetMapping("/all")
    public Customers listAllCustomers(){
        return new Customers(customerDao.findAll().spliterator());
    }

}
