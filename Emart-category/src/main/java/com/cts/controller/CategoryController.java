package com.cts.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.cts.model.Category;
import com.cts.service.CategoryService;

@RestController
public class CategoryController {
	
	@Autowired
	CategoryService service;
	
	@RequestMapping("/categories")
	List<Category> getAllUsers() {
		return service.getAllCategories();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/categories")
	void addCategory(@RequestBody Category category) {
		service.addCategory(category);
	}
	
	@RequestMapping("/categories/{id}")
	Optional<Category> getCategoryDetailsByID(@PathVariable int id) {
		return service.getCategoryDetailsByID(id);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/categories")
	void updateUser(@RequestBody Category category) {
		service.updateCategory(category);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/categories/{id}")
	void deleteUser(@PathVariable int id) {
		service.deleteCategory(id);
	}
	
	
	@RequestMapping("/categories/categoryname/{categoryname}")
	Category getCategoryByCategoryName(@PathVariable String categoryname)
	{
		return service.getCategoryByCategoryName(categoryname);
	}

}
