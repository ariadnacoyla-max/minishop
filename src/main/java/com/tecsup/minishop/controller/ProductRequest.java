package com.tecsup.minishop.controller;

import lombok.Data;

@Data
public class ProductRequest {

    private String name;
    private Double price;
    private Integer stock;
}