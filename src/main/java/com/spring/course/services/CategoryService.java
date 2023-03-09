package com.spring.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.course.entities.Category;
import com.spring.course.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository userRepository;
	
	public List<Category> findAll(){
		return userRepository.findAll();	
	}
	
	public Category findById(Long id) {
		
		Optional<Category> category = userRepository.findById(id);
		return category.get();
	}
}
