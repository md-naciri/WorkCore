package com.workcore.services;

import com.workcore.entities.Employee;
import com.workcore.repositories.EmployeeRepository;

import java.util.List;
import java.util.Optional;

public class EmployeeServiceImp implements EmployeeService{
    private EmployeeRepository employeeRepository;

    public EmployeeServiceImp(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Optional<Employee> findById(Long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public void create(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void update(Employee employee) {
        Optional<Employee> isEmployeeExist = employeeRepository.findById(employee.getId());
        if (isEmployeeExist.isPresent()){
            employeeRepository.save(employee);
        }
    }

    @Override
    public void delete(Employee employee) {
        employeeRepository.delete(employee);
    }
}
