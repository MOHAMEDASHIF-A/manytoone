//employeeRepo.java
package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;



import com.example.demo.Model.employee;
public interface employeerepo extends JpaRepository<employee, Integer>{
	
	
}