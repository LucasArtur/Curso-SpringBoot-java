package com.lucasartur.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.lucasartur.course.entities.Order;
import com.lucasartur.course.repositories.OrderRepository;

@Service
public class OrderService {

	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();	
		}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
		
	}
	
}
