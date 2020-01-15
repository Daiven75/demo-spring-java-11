package com.project.demoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.demoSpring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
