package com.example.mapper;

import java.util.List;

import com.example.model.User;

public interface UserMapper {
	   User selectUserById(int id);
	    List<User> selectAllUsers();
	    void insertUser(User user);
	    void updateUser(User user);
	    void deleteUser(int id);
}
