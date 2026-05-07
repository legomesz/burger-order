package com.burgerorder.burgerorder.repository;

import com.burgerorder.burgerorder.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}