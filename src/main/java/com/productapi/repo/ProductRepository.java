package com.productapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productapi.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	
}
