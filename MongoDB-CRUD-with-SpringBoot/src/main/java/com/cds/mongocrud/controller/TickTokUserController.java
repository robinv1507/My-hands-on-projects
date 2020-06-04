package com.cds.mongocrud.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cds.mongocrud.dto.TickTokUserBean;
import com.cds.mongocrud.services.UserService;

@RestController
public class TickTokUserController {
	@Autowired
	UserService userService;
	
	@GetMapping("/get_user_by_name")
	Object getUserByName(@PathParam(value = "name") String name) {
		
		return userService.getUserByName(name);
	}//end of getUserByName
	
	/*==============================================================*/
	
	@PostMapping("/create_account")
	Object createAccount(@RequestBody TickTokUserBean bean) {
		return userService.createUserAccount(bean);
	}//end of createAccount
	
	@GetMapping("/get_all_user")
	Object getAllUser() {
		
		return userService.getAllUser();
	}//end of getAllUser
	/*==============================================================*/
	@DeleteMapping("/delete_by_email/{email}")
	Object deleteByEmail(@PathVariable("email") String email) {
		return userService.deleteByEmail(email);
		
	}
	
   
}//end of TickTokUserController
