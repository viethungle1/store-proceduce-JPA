package com.example.store_proceduce_jpa.repository;

import com.example.store_proceduce_jpa.model.Customer;

import java.util.List;

public interface ICustomerRepository {
    boolean saveWithStoredProcedure(Customer customer);
}
