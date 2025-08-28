package com.example.rest.orderClientAPI.model;

import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;

@Data
public class Order {

    private Long id;

    private String product;

    private BigDecimal price;

    private Client client;

    private Instant createAt;

    private Instant updateAt;
}
