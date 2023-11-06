package com.workcore.services;

import com.workcore.entities.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {
    Optional<Department> findById(Long id);
    List<Department> findAll();
    void create(Department department);
    void update(Department department);
    void delete(Department department);
}
