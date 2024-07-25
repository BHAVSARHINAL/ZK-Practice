package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapper.UserMapper;
import com.example.model.User;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;
	

    public User getUserById(int id) {
        return userMapper.selectUserById(id);
    }

    public List<User> getAllUsers() {
        return userMapper.selectAllUsers();
    }

    public void createUser(User user) {
        userMapper.insertUser(user);
    }

    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    public void deleteUser(int id) {
        userMapper.deleteUser(id);
    }

}
