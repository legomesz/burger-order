package com.burgerorder.burgerorder.controller;

import com.burgerorder.burgerorder.model.OrderItem;
import com.burgerorder.burgerorder.model.OrderStatus;

import java.util.List;

public class OrderRequest {

    private Long userId;
    private List<OrderItem> items;
    private OrderStatus status;

    public OrderRequest() {
    }

    public OrderRequest(Long userId, List<OrderItem> items, OrderStatus status) {
        this.userId = userId;
        this.items = items;
        this.status = status;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}