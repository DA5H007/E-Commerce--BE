package com.shivansh.shoppingcart.service.order;

import com.shivansh.shoppingcart.dto.OrderDto;
import com.shivansh.shoppingcart.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);
}
