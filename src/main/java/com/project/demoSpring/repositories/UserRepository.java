package com.project.demoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.demoSpring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
