package com.chirango.EmployeeBackend.service;

import com.chirango.EmployeeBackend.entity.EmployeeEntity;
import com.chirango.EmployeeBackend.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();
}
