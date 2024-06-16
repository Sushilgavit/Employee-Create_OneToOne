package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity 
@Table(name="EMPLOYEE_STATUS")
public class EmployeeStatus {

    @Id
    @Column(name = "EMPLOYEE_ID")
    private int employeeID;
    
    @Column(name="SNO")
    private int sno;

    @Column(name="CREATION_TIME")
    private String creationTime;

    @Column(name="MODIFICATION_BY")
    private String modificationBy;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "REMARK")
    private String remark;

    @OneToOne
    @JoinColumn(name = "EMPLOYEE_ID", referencedColumnName = "EMPLOYEE_ID")
    private Employee employee;

    // Constructors, getters, and setters

    public EmployeeStatus() {
        // Default constructor
    }

    public EmployeeStatus(int employeeID, int sno, String creationTime, String modificationBy, String status, String remark, Employee employee) {
        this.employeeID = employeeID;
        this.sno = sno;
        this.creationTime = creationTime;
        this.modificationBy = modificationBy;
        this.status = status;
        this.remark = remark;
        this.employee = employee;
    }

    // Getters and setters
    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public String getModificationBy() {
        return modificationBy;
    }

    public void setModificationBy(String modificationBy) {
        this.modificationBy = modificationBy;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    // toString method
    @Override
    public String toString() {
        return "EmployeeStatus{" +
                "employeeID=" + employeeID +
                ", sno=" + sno +
                ", creationTime='" + creationTime + '\'' +
                ", modificationBy='" + modificationBy + '\'' +
                ", status='" + status + '\'' +
                ", remark='" + remark + '\'' +
                ", employee=" + employee +
                '}';
    }
}
