package com.workcore.services;

import com.workcore.entities.Department;
import com.workcore.repositories.DepartmentRepository;

import java.util.List;
import java.util.Optional;

public class DepartmentServiceImp implements DepartmentService{
    private DepartmentRepository departmentRepository;

    public DepartmentServiceImp(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Optional<Department> findById(Long id) {
        return departmentRepository.findById(id);
    }

    @Override
    public List<Department> findAll() {
        return departmentRepository.findAll();
    }

    @Override
    public void create(Department department) {
        departmentRepository.save(department);
    }

    @Override
    public void update(Department department) {
        Optional<Department> isDepartmentExist = departmentRepository.findById(department.getId());
        if(isDepartmentExist.isPresent()){
            departmentRepository.save(department);
        }
    }

    @Override
    public void delete(Department department) {
        departmentRepository.delete(department);
    }
}
