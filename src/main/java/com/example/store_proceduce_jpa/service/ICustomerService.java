package com.example.store_proceduce_jpa.service;

import com.example.store_proceduce_jpa.model.Customer;

import java.util.List;

public interface ICustomerService {
    boolean saveWithStoredProcedure(Customer customer);
}
