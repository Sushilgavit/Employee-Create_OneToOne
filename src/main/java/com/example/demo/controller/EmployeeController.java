package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.EmployeeService;
import com.example.demo.entity.Employee;
import com.example.demo.entity.EmployeeStatus;


@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employees")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        Employee createdEmployee = employeeService.createEmployee(employee);
        return ResponseEntity.ok(createdEmployee);
    }

    @PostMapping("/employee-statuses")
    public ResponseEntity<EmployeeStatus> createEmployeeStatus(@RequestBody EmployeeStatus employeeStatus) {
        EmployeeStatus createdEmployeeStatus = employeeService.createEmployeeStatus(employeeStatus);
        return ResponseEntity.ok(createdEmployeeStatus);
    }
}
