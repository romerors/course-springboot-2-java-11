package com.praticaweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.praticaweb.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
