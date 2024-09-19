package com.stellantis.assetManagement.dao;

import com.stellantis.assetManagement.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, String> {
    // You can add custom query methods if needed
}