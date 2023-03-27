package com.hermes.customerDatabase.src.customer;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository  extends CrudRepository<Customer, Long> {

    void deleteById(int id);

    void deleteAllByLoginId(Long id);

    List<Customer> findByLoginId(Long loginId);

    Optional<Customer> findById(int id);


}

