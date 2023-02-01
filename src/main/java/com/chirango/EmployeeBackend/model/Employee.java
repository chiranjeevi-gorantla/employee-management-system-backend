package com.chirango.EmployeeBackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Long employeeId;
    private String firstName;
    private String lastName;
    private String emailId;
}
