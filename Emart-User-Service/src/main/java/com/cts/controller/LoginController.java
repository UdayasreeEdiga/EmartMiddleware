package com.cts.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.BuyerLogin;
import com.cts.service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	LoginService service;

	@RequestMapping("/users")
	List<BuyerLogin> getAllUsers() {
		return service.getAllUsers();
	}
	
//	@RequestMapping(method = RequestMethod.POST, value = "/users")
//	void addUser(@RequestBody Buyer buyer) {
//		service.addUser(user);
//	}
//	
//	@RequestMapping("/users/{id}")
//	Optional<User> getUserDetailsByID(@PathVariable int id) {
//		return service.getUserDetailsByID(id);
//	}
//	
//	@RequestMapping(method = RequestMethod.PUT, value = "/users/")
//	void updateUser(@RequestBody User user) {
//		service.updateUser(user);
//	}
//	
//	@RequestMapping(method = RequestMethod.DELETE, value = "/users/{id}")
//	void deleteUser(@PathVariable int id) {
//		service.deleteUser(id);
//	}
//	
//	
//	@RequestMapping("/users/address/{address}")
//	User getUserByAddress(@PathVariable String address)
//	{
//		return service.getUserByAddress(address);
//	}
//	
}


//	GET - Fetching all details
//	POST - Add
//	PUT - Update
//	Delete - delete













