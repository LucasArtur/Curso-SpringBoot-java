package com.lucasartur.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.lucasartur.course.entities.Category;
import com.lucasartur.course.repositories.CategoryRepository;

@Service
public class CategoryService {

	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();	
		}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
		
	}
	
}
