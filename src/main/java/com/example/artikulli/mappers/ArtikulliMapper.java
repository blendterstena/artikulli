package com.example.artikulli.mappers;

import com.example.artikulli.dto.ArtikulliDto;
import com.example.artikulli.models.Artikulli;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ArtikulliMapper {
    public Artikulli toEntity(ArtikulliDto from){
        var to = new Artikulli();
        to.setId(from.getId());
        to.setName(from.getName());
        to.setDescription(from.getDescription());
        to.setPrice(from.getPrice());
        to.setStockQuantity(from.getStockQuantity());
        to.setInStock(from.isInStock());
        to.setProducedDate(from.getProducedDate());
        to.setExpirationDate(from.getExpirationDate());
        to.setCreatedAt(LocalDateTime.now());
        to.setCreatedBy("admin");
        return to;
    }

    public ArtikulliDto toArtikulliDto(Artikulli from){
        var to = new ArtikulliDto();
        to.setId(from.getId());
        to.setName(from.getName());
        to.setDescription(from.getDescription());
        to.setPrice(from.getPrice());
        to.setStockQuantity(from.getStockQuantity());
        to.setInStock(from.isInStock());
        to.setProducedDate(from.getProducedDate());
        to.setExpirationDate(from.getExpirationDate());
        return to;
    }

}
