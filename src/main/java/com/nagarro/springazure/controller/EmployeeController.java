package com.nagarro.springazure.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
//import com.nagarro.springazure.domain.Employee;
import com.nagarro.springazure.entity.Employee;
import com.nagarro.springazure.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    private EmployeeRepository repository;

    /*@GetMapping("/employees")
    public List<Employee> getEmployees() {
        List<com.nagarro.springazure.entity.Employee> all = repository.findAll();
        List<Employee> emp =  (List<Employee>) objectMapper.convertValue(all, Employee.class);
        return emp;
    }

    @PostMapping("/employee")
    public com.nagarro.springazure.entity.Employee addEmployee(@RequestBody Employee employee) {
        return repository.save(
                objectMapper.convertValue(employee, com.nagarro.springazure.entity.Employee.class));
    }*/

    @GetMapping("/employee")
    public List<Employee> getEmployees() {
        return repository.findAll();
    }

    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee employee) {
        return repository.save(employee);
    }
}
