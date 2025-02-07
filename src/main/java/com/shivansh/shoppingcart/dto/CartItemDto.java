package com.shivansh.shoppingcart.dto;

import com.shivansh.shoppingcart.model.Product;

import java.math.BigDecimal;

public class CartItemDto {
    private Long itemId;
    private Integer quantity;
    private BigDecimal unitPrice;
    private ProductDto product;
}
