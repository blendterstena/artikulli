package com.example.artikulli.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArtikulliDto {
    private long id;
    private String name;
    private String description;
    private double price;
    private int stockQuantity;
    private boolean inStock;
    private LocalDate producedDate;
    private LocalDate expirationDate;
}
