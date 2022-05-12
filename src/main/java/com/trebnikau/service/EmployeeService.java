package com.trebnikau.service;

import com.trebnikau.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> readAllEmployees();

    Employee readEmployee(int employeeId);

    void saveEmployee(Employee employee);

    void deleteEmployee(int employeeId);
}
