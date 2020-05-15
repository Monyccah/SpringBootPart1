package com.springboot.SpringBootApplication;

import com.springboot.SpringBootApplication.model.User;
import com.springboot.SpringBootApplication.repo.FakeRepo;
import com.springboot.SpringBootApplication.services.UserServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;

@SpringBootTest
class ApplicationTests {

	UserServiceImpl userService = new UserServiceImpl(new FakeRepo());
	@Test
	void contextLoads() {
	}

	@Test
	public void addUserTest(){
		userService.addUser("Monica", "Hello");
	}
	@Test
	public void removeUserTest(){
		userService.removeUser(0);



	}
	@Test
	public void getUserTest(){
		userService.addUser("Monica", "Hello");
		userService.getUser(0);


	}


}
