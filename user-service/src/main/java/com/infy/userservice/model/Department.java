package com.infy.userservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
	
	private Long depId;
	private String depName;
	private String depAddress;
	private String depCode;

}
