package com.codeclan.example.userservice;

import com.codeclan.example.userservice.models.User;
import com.codeclan.example.userservice.repositories.FileRepository;
import com.codeclan.example.userservice.repositories.FolderRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.codeclan.example.userservice.repositories.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserserviceApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	UserRepository userRepository;

	@Autowired
	FolderRepository folderRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createUser(){
		User will = new User("Will");
		userRepository.save(will);
	}

}
