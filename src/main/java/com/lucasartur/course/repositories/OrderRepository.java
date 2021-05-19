package com.lucasartur.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasartur.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
