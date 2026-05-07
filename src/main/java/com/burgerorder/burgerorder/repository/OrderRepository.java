package com.burgerorder.burgerorder.repository;

import com.burgerorder.burgerorder.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}