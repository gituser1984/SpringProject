package com.infy.userservice.model;

import com.infy.userservice.entity.UserDetail;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDepartment {
	
	private Department department;
	private UserDetail user;

}
