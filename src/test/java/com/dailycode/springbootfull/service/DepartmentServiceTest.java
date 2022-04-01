package com.dailycode.springbootfull.service;

import com.dailycode.springbootfull.entiyt.Department;
import com.dailycode.springbootfull.repository.DepartmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DepartmentServiceTest {

    @Autowired
    DepartmentService departmentService;

    @MockBean
    DepartmentRepository departmentRepository;

    @BeforeEach
    void setUp() {
        Department department = Department.builder()
                .departmentName("ECE")
                .departmentAddress("HYDERABAD")
                .departmentCode("4")
                .departmentId(1L)
                .build();
        Mockito.when(departmentRepository.findByDepartmentNameIgnoreCase("ECE"))
                .thenReturn(department);
    }

    @Test
    @DisplayName("Get data based on valid Department Name")
    public void whenValidDepartmentName_thenDepartmentShouldFound(){
        String departmentName = "ECE";
        Department found = departmentService.fetchDepartmentByName(departmentName);
        assertEquals(departmentName,found.getDepartmentName());
    }


}