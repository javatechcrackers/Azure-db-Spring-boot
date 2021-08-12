package com.nagarro.springazure.repository;

import com.nagarro.springazure.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
