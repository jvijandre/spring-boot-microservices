package com.app.justin.order.controller;

import com.app.justin.order.dto.OrderRequest;
import com.app.justin.order.dto.OrderResponse;
import com.app.justin.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @RequestMapping
    @ResponseStatus(HttpStatus.OK)
    public List<OrderResponse> getOrder() {
        return orderService.getOrders();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderRequest orderRequest) {
        orderService.placeOrder(orderRequest);
        return "Order placed successfully.";
    }
}
