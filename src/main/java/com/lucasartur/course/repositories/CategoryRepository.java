package com.lucasartur.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasartur.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
