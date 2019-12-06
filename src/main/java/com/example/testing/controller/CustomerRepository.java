package com.example.testing.controller;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.testing.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

	List<Customer> findByAge(int age);

}
