package com.shivansh.shoppingcart.model;

import java.math.BigDecimal;

public class Product {
    private Long id;
    private String name;
    private String Brand;
    private BigDecimal price;
    private int inventory;
    private String description;

    private Category category;
    private Image image;
}
