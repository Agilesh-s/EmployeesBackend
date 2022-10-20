package com.example.employeesApp.Dao;

import com.example.employeesApp.Model.EmployeesModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeesDao extends CrudRepository<EmployeesModel,Integer> {

    @Modifying
    @Query(value = "DELETE FROM `employee_table` WHERE `id` = :id",nativeQuery = true)
    void deleteEmployeeById(Integer id);

    @Query(value = "SELECT `id`, `address`, `designation`, `employee_id`, `employee_name`, `salary` FROM `employee_table` WHERE `employee_name` = :name", nativeQuery = true)
    List<EmployeesModel> searchEmployeeByName(String name);
}
