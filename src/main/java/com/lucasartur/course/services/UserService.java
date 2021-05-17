package com.lucasartur.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.lucasartur.course.entities.User;
import com.lucasartur.course.repositories.UserRepository;

@Service
public class UserService {

	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();	
		}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
		
	}
	
}