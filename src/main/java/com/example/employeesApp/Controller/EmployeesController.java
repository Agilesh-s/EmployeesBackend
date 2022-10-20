package com.example.employeesApp.Controller;

import com.example.employeesApp.Dao.EmployeesDao;
import com.example.employeesApp.Model.EmployeesModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
public class EmployeesController {

    @Autowired
    public EmployeesDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addEmployee", consumes = "application/json", produces = "application/json")
    public String addEmployee(@RequestBody EmployeesModel employees){
        dao.save(employees);
        return "Status:Success";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewEmployee")
    public List<EmployeesModel> viewEmployee(){
        return (List<EmployeesModel>)dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @Transactional
    @PostMapping(path = "/deleteEmployee", consumes = "application/json", produces = "application/json")
    public String deleteEmployee(@RequestBody EmployeesModel employees){
        dao.deleteEmployeeById(employees.getId());
        return "Status:Success";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/searchEmployee", consumes = "application/json", produces = "application/json")
    public List<EmployeesModel> searchEmployee(@RequestBody EmployeesModel employees){
        return (List<EmployeesModel>)dao.searchEmployeeByName(employees.getEmployeeName());
    }
}
