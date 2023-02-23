package com.spring.jpa.repository;

import com.spring.jpa.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    Page<Employee> findByFirstNameContaining(String title, Pageable pageable);

    List<Employee> findByFirstNameContaining(String title, Sort sort);
}
