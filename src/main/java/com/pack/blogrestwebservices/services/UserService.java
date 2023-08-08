package com.pack.blogrestwebservices.services;

import java.util.List;

import com.pack.blogrestwebservices.entities.User;
import com.pack.blogrestwebservices.payloads.UserDto;

public interface UserService {
	
	UserDto createUser(UserDto user);
	UserDto updateUser(UserDto user,Integer userId);
	UserDto getUserById(Integer userId);
	List<UserDto> getAllUsers();
	void deleteUser(Integer userId);

}
