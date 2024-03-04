package com.example.store_proceduce_jpa.repository;

import com.example.store_proceduce_jpa.model.Customer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

@Transactional
@Repository
public class CustomerRepository implements ICustomerRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public boolean saveWithStoredProcedure(Customer customer) {
        String sql = "CALL Insert_Customer(:firstName, :lastName)";
        Query query = entityManager.createNativeQuery(sql);
        query.setParameter("firstName", customer.getFirstName());
        query.setParameter("lastName", customer.getLastName());
        return query.executeUpdate() != 0;
    }
}
