package com.dailycode.springbootfull.service;

import com.dailycode.springbootfull.entiyt.Department;

import java.util.List;

public interface DepartmentService {

    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long departmentId);
}
