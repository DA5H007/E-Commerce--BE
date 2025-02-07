package com.shivansh.shoppingcart.dto;

import com.shivansh.shoppingcart.model.Cart;
import com.shivansh.shoppingcart.model.Order;
import lombok.Data;

import java.util.List;

@Data
public class UserDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private List<OrderDto> orders;
    private CartDto cart;
}
