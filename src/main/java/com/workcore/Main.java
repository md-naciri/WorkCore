package com.workcore;

import com.workcore.entities.Department;
import com.workcore.entities.Employee;
import com.workcore.services.DepartmentService;
import com.workcore.services.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Optional;


public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");

        DepartmentService departmentService = applicationContext.getBean("departmentService", DepartmentService.class);
        EmployeeService employeeService = applicationContext.getBean("employeeService", EmployeeService.class);

        /*Department department = applicationContext.getBean("departmentBeen", Department.class);
        Employee employee = applicationContext.getBean("employeeBeen", Employee.class);
        departmentService.create(department);
        employeeService.create(employee);*/

        /*Department department1 = new Department("Math");
        departmentService.create(department1);
        Employee employee1 = new Employee("Youssef", 15000, department1);
        employeeService.create(employee1);*/

        //System.out.println(employeeService.findAll());
        Optional<Department> departmentOptional = departmentService.findById(5L);
        if (departmentOptional.isPresent()){
            Department department = departmentOptional.get();
            System.out.println(department);
            departmentService.delete(department);
            System.out.println("Department deleted successfully");
        }  else {
            System.out.println("Department not found for the given ID.");
        }

    }
}