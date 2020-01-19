package com.project.demoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.demoSpring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
