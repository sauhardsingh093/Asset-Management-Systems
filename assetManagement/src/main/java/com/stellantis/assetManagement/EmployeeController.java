package com.stellantis.assetManagement;
import com.stellantis.assetManagement.Entity.Employee;
import com.stellantis.assetManagement.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Controller
@CrossOrigin("*")
@RequestMapping("/employees")



public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{tid}")
    public ResponseEntity<Employee> getEmployeeByTid(@PathVariable String tid) {
        Optional<Employee> employee = Optional.ofNullable(employeeService.getEmployeeByTid(tid));
        return employee.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @PostMapping
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        Employee savedEmployee = employeeService.addEmployee(employee);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    @PutMapping("/{tid}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable String tid, @RequestBody Employee employee) {
        Employee updatedEmployee = employeeService.updateEmployee(tid, employee);
        if (updatedEmployee != null) {
            return ResponseEntity.ok(updatedEmployee);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @DeleteMapping("/{tid}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable String tid) {
        if (employeeService.deleteEmployee(tid)) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
