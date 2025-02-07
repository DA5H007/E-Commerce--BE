package com.shivansh.shoppingcart.dto;

import com.shivansh.shoppingcart.model.Product;
import lombok.Data;

import java.math.BigDecimal;
@Data
public class CartItemDto {
    private Long itemId;
    private Integer quantity;
    private BigDecimal unitPrice;
    private ProductDto product;
}
