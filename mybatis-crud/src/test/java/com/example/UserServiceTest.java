package com.example;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.model.User;
import com.example.service.UserService;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
public class UserServiceTest {

	 @Autowired
	    private UserService userService;

	    @Test
	    void testCRUD() {
	        // Create
	        User newUser = new User();
	        newUser.setName("John Doe");
	        newUser.setEmail("john.doe@example.com");
	        userService.createUser(newUser);

	        // Read
	        User user = userService.getUserById(newUser.getId());
	        assertNotNull(user);
	        assertEquals("John Doe", user.getName());

	        // Update
	        user.setName("Jane Doe");
	        userService.updateUser(user);
	        User updatedUser = userService.getUserById(user.getId());
	        assertEquals("Jane Doe", updatedUser.getName());

	        // Delete
	        userService.deleteUser(user.getId());
	        assertNull(userService.getUserById(user.getId()));
	    }
}
