package com.chirango.EmployeeBackend.repository;

import com.chirango.EmployeeBackend.entity.EmployeeEntity;
import com.chirango.EmployeeBackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
}
