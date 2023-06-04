package com.allrelations.allrelations.repository;

import com.allrelations.allrelations.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
