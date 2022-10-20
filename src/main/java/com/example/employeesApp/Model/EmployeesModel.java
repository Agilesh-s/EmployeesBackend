package com.example.employeesApp.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employeeTable")
public class EmployeesModel {

    @Id
    @GeneratedValue
    private int id;
    private int employeeId;
    private String employeeName;
    private int salary;
    private String designation;
    private String address;

    public EmployeesModel() {
    }

    public EmployeesModel(int id, int employeeId, String employeeName, int salary, String designation, String address) {
        this.id = id;
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        this.designation = designation;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
