package com.lucasartur.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasartur.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
