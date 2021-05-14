package com.lucasartur.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasartur.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
