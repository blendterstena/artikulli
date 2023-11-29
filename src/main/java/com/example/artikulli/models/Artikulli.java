package com.example.artikulli.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "artikujt")
public class Artikulli {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
    private double price;
    private int stockQuantity;
    private boolean inStock;
    private LocalDate producedDate;
    private LocalDate expirationDate;
    private LocalDateTime createdAt;
    private String createdBy;

}
