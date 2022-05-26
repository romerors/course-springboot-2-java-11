package com.praticaweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.praticaweb.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
