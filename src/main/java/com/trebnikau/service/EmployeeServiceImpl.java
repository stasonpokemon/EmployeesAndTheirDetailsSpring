package com.trebnikau.service;

import com.trebnikau.dao.EmployeeDAO;
import com.trebnikau.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public List<Employee> readAllEmployees() {
        List<Employee> employees = employeeDAO.readAllEmployees();
        return employees;
    }

    @Override
    @Transactional
    public Employee readEmployee(int employeeId) {
        Employee employee = employeeDAO.readEmployee(employeeId);
        return employee;
    }

    @Override
    @Transactional
    public void saveEmployee(Employee employee) {
        employeeDAO.saveEmployee(employee);
    }

    @Override
    @Transactional
    public void deleteEmployee(int employeeId) {
        employeeDAO.deleteEmployee(employeeId);
    }
}
