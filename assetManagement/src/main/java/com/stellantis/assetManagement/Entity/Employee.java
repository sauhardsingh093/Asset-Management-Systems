package com.stellantis.assetManagement.Entity;

import jakarta.persistence.*;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tid")
    private String tid;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;


    @Column(name = "entity")
    private String entity;

    @Column(name = "location")
    private String location;

    @Column(name = "classification")
    private String classification;

    @Column(name = "date_of_join")
    private java.sql.Date dateOfJoin;

    @Column(name = "last_working_day")
    private java.sql.Date lastWorkingDay;

    @Column(name = "department")
    private String department;

    // getters and setters


    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public Date getDateOfJoin() {
        return dateOfJoin;
    }

    public void setDateOfJoin(Date dateOfJoin) {
        this.dateOfJoin = (java.sql.Date) dateOfJoin;
    }

    public Date getLastWorkingDay() {
        return lastWorkingDay;
    }

    public void setLastWorkingDay(Date lastWorkingDay) {
        this.lastWorkingDay = (java.sql.Date) lastWorkingDay;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Employee() {
        // Default constructor without any arguments
    }

}

