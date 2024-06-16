package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.EmployeeRepository;
import com.example.demo.Repository.EmployeeStatusRepository;
import com.example.demo.entity.Employee;
import com.example.demo.entity.EmployeeStatus;


@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeStatusRepository employeeStatusRepository;


   

	public Employee createEmployee(Employee employee) {
		
	   return employeeRepository.save(employee);
	}

	public EmployeeStatus createEmployeeStatus(EmployeeStatus employeeStatus) {
		
		 return employeeStatusRepository.save(employeeStatus);
	}
}