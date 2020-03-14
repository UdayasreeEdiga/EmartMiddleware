package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cts.Repository.LoginRepo;
import com.cts.model.BuyerLogin;

public class LoginService {
	
	@Autowired
	LoginRepo repo;



	public List<BuyerLogin> getAllUsers() {
		
		return null;
	}

}
