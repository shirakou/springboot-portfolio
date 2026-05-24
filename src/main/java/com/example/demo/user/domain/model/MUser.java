package com.example.demo.user.domain.model;

import java.util.Date;

import lombok.Data;

@Data
public class MUser {
	private String user_id;
	private String password;
	private String userName;
	private Date birthday;
	private Integer age;
	private Integer gender;
	private Integer departmentID;
	private String role;
}
