package com.app.justin.order.service;

import com.app.justin.order.dto.OrderRequest;
import com.app.justin.order.dto.OrderResponse;
import com.app.justin.order.model.Order;
import com.app.justin.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public List<OrderResponse> getOrders() {
        return orderRepository.findAll()
                .stream()
                .map(o -> new OrderResponse(o.getId(), o.getOrderNumber(), o.getSkuCode(), o.getPrice(), o.getQuantity()))
                .toList();
    }

    public void placeOrder(OrderRequest orderRequest) {
        Order order = new Order(
                orderRequest.id(),
                UUID.randomUUID().toString(),
                orderRequest.skuCode(),
                orderRequest.price(),
                orderRequest.quantity());
        orderRepository.save(order);
    }
}
