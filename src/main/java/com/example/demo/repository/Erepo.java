package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Employee;

public interface Erepo extends JpaRepository<Employee, Integer> {
	@Query("FROM Employee where id =3")
	List<Employee> findAll();

}
