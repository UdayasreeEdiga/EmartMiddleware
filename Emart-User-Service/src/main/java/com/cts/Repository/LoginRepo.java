package com.cts.Repository;

import org.springframework.data.repository.CrudRepository;

import com.cts.model.BuyerLogin;

public interface LoginRepo extends CrudRepository<BuyerLogin,Integer>{

}
