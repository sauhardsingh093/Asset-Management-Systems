package com.stellantis.assetManagement.Service;

import com.stellantis.assetManagement.Entity.Employee;
import com.stellantis.assetManagement.dao.EmployeeRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeeById(String tid) {
        return employeeRepository.findById(tid);
    }

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void removeEmployee(String tid) {
        employeeRepository.deleteById(tid);
    }

    public Employee getEmployeeByTid(String tid) {
        Optional<Employee> employeeOptional = employeeRepository.findById(tid);
        return employeeOptional.orElse(null);    }

    public Employee updateEmployee(String tid, Employee employee) {
        Optional<Employee> employeeOptional = employeeRepository.findById(tid);

        if (employeeOptional.isPresent()) {
            Employee existingEmployee = employeeOptional.get();
            // Update the fields of the existing employee with the new values
            Employee updatedEmployee = null;
            existingEmployee.setFirstName(updatedEmployee.getFirstName());
            existingEmployee.setLastName(updatedEmployee.getLastName());
            existingEmployee.setEmail(updatedEmployee.getEmail());
            // Update other fields as needed

            // Save the updated employee
            return employeeRepository.save(existingEmployee);
        } else {
            throw new EntityNotFoundException("Employee with TID " + tid + " not found");
        }
    }

    public boolean deleteEmployee(String tid) {
        Optional<Employee> employeeOptional = employeeRepository.findById(tid);

        if (employeeOptional.isPresent()) {
            employeeRepository.deleteById(tid);
            return true;
        } else {
            return false;  // Employee with the given tid doesn't exist
        }
    }

    // You can add more service methods as needed

}


