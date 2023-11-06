package com.workcore.services;

import com.workcore.entities.Employee;
import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    Optional<Employee> findById(Long id);
    List<Employee> findAll();
    void create(Employee employee);
    void update(Employee employee);
    void delete(Employee employee);
}
