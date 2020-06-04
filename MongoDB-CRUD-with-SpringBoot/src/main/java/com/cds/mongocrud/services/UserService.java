package com.cds.mongocrud.services;

import java.io.Console;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.cds.mongocrud.dto.TickTokUserBean;
import com.cds.mongocrud.repository.UserRepository;

import lombok.extern.java.Log;

@Log
@Service
public class UserService {
	@Autowired
	UserRepository userRepository;

	public TickTokUserBean getUserByName(String name) {
		TickTokUserBean tickTokUserBean = userRepository.findByUserName(name);

		System.out.println("userDatabyName=" + tickTokUserBean);

		System.out.println("Alldata=" + userRepository.findAll());

		return tickTokUserBean;

	}

	public Object createUserAccount(TickTokUserBean bean) {

		userRepository.save(bean);
		return "user created successfully";
	}

	public Object getAllUser() {

		return userRepository.findAll();

	}

	public Object deleteByEmail(String email) {
		return "deleted this user "+ userRepository.deleteByEmail(email);

	}

}// end of UserService class
