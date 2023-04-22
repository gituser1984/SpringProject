package com.infy.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.infy.userservice.entity.UserDetail;
import com.infy.userservice.model.Department;
import com.infy.userservice.model.UserDepartment;
import com.infy.userservice.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	public UserDetail saveUser(UserDetail user) {
		log.info("Inside saveUser of UserService");
		return userRepository.save(user);
	}

	public UserDepartment getUserWithDepartment(Long userId) {
		log.info("Inside getUserWithDepartment of UserService");
		UserDetail user = userRepository.findById(userId).get();
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+user.getDepId(), Department.class);
		UserDepartment userDepartment = UserDepartment.builder()
				.department(department)
				.user(user).build();
		
		return userDepartment;
	}

}
