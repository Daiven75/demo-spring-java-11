package com.project.demoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.demoSpring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
