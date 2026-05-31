package com.burgerorder.burgerorder.controller;

import com.burgerorder.burgerorder.model.Order;
import com.burgerorder.burgerorder.model.OrderItem;
import com.burgerorder.burgerorder.model.OrderStatus;
import com.burgerorder.burgerorder.model.Product;
import com.burgerorder.burgerorder.repository.OrderRepository;
import com.burgerorder.burgerorder.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/orders")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    public Order createOrder(@RequestBody Order order) {

        if (order.getItems() == null || order.getItems().isEmpty()) {
            throw new RuntimeException("O pedido deve conter pelo menos um item.");
        }

        double total = 0.0;
        List<Long> productIds = new ArrayList<>();

        for (OrderItem item : order.getItems()) {
            Product product = productRepository.findById(item.getProductId())
                    .orElseThrow(() -> new RuntimeException("Produto não encontrado: " + item.getProductId()));

            int quantity = item.getQuantity() != null ? item.getQuantity() : 1;

            total += product.getPrice() * quantity;
            productIds.add(item.getProductId());

            item.setProductName(product.getName());
            item.setOrder(order);
        }

        order.setProductIds(productIds);
        order.setTotal(total);

        if (order.getStatus() == null) {
            order.setStatus(OrderStatus.PENDENTE);
        }

        return orderRepository.save(order);
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable Long id) {
        return orderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pedido não encontrado"));
    }

    @PatchMapping("/{id}/status")
    public Order updateOrderStatus(@PathVariable Long id, @RequestBody Order updatedOrder) {
        Order order = orderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pedido não encontrado"));

        order.setStatus(updatedOrder.getStatus());

        return orderRepository.save(order);
    }

    @DeleteMapping("/{id}")
    public String deleteOrder(@PathVariable Long id) {
        Order order = orderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pedido não encontrado"));

        orderRepository.delete(order);

        return "Pedido deletado com sucesso";
    }
}