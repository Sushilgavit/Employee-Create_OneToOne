package com.example.demo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity 
@Table(name="EMPLOYEE_NEW_150923")
public class Employee {

    @Id
    @Column(name="EMPLOYEE_ID")
    private int employeeID;

    @Column(name="FIRST_NAME")
    private String firstname;

    @Column(name="LAST_NAME")
    private String lastname;

    @Column(name = "DEPARTMENT")
    private String department;

    @Column(name = "LOCATION")
    private String location;

    @Column(name = "AGE")
    private int age;

    @Column(name="PHONE_NO")
    private String phoneno;

    @Column(name ="GENDER")
    private String gender;


    @OneToOne(mappedBy = "employee" ,cascade = CascadeType.ALL )
    private EmployeeStatus employeeStatus;

    // Getters and setters
    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public EmployeeStatus getEmployeeStatus() {
        return employeeStatus;
    }

    public void setEmployeeStatus(EmployeeStatus employeeStatus) {
        this.employeeStatus = employeeStatus;
    }
}
