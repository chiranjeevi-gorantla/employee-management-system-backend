package com.chirango.EmployeeBackend.service;

import com.chirango.EmployeeBackend.entity.EmployeeEntity;
import com.chirango.EmployeeBackend.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();

    boolean deleteEmployee(Long id);

    Employee getEmployeeById(Long id);

    Employee updateEmployee(Long id, Employee employee);
}
