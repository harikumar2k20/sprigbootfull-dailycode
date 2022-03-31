package com.dailycode.springbootfull.repository;

import com.dailycode.springbootfull.entiyt.Department;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class DepartmentRepositoryTest {

    @Autowired
    DepartmentRepository departmentRepository;

    @Autowired
    TestEntityManager entityManager;

    @BeforeEach
    void setUp() {
        Department department = Department.builder()
                .departmentName("ME")
                .departmentAddress("Delhi")
                .departmentCode("3")
                .build();
        entityManager.persist(department);
    }

    @Test
    public void whenFindById_thenReturnDepartment(){
        Department department = departmentRepository.findById(1l).get();
        assertEquals(department.getDepartmentName(), "ME");
    }
}