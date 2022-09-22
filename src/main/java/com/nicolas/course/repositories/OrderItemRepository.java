package com.nicolas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nicolas.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
