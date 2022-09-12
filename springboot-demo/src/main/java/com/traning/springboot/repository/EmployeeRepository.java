package com.traning.springboot.repository;

import com.traning.springboot.model.Employee;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Integer> {

    Optional<Employee> findById(Integer id);
}