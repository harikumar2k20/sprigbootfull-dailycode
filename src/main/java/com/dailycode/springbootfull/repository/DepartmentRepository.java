package com.dailycode.springbootfull.repository;

import com.dailycode.springbootfull.entiyt.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
