package com.infy.departmentservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.departmentservice.entity.Department;
import com.infy.departmentservice.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		log.info("inside saveDepartment of DepartmentService");
		return departmentRepository.save(department);
	
	}

	public Department findDepartmentById(Long depId) {
		log.info("inside findDepartmentById of DepartmentService");
		return departmentRepository.findById(depId).get();
	}

}
