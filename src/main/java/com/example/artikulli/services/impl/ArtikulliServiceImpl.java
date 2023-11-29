package com.example.artikulli.services.impl;

import com.example.artikulli.dto.ArtikulliDto;
import com.example.artikulli.mappers.ArtikulliMapper;
import com.example.artikulli.repositories.ArtikulliRepository;
import com.example.artikulli.services.ArtikulliService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtikulliServiceImpl implements ArtikulliService {
    private final ArtikulliRepository artikulliRepository;
    private final ArtikulliMapper mapper;

    public ArtikulliServiceImpl(ArtikulliRepository artikulliRepository, ArtikulliMapper mapper) {
        this.artikulliRepository = artikulliRepository;
        this.mapper = mapper;
    }

    @Override
    public boolean add(ArtikulliDto artikulliDto) {
        var entity = mapper.toEntity(artikulliDto);
        artikulliRepository.save(entity);
        return true;
    }

    @Override
    public List<ArtikulliDto> getAll() {
        return artikulliRepository.findAll().stream().map(mapper::toArtikulliDto).toList();
    }

    @Override
    public ArtikulliDto getById(long id) {
        var optionalEntity = artikulliRepository.findById(id);
        if (optionalEntity.isEmpty())
            throw new EntityNotFoundException("Artikulli me id "+id+" nuk u gjet");
        var entity = optionalEntity.get();
        return mapper.toArtikulliDto(entity);
    }

    @Override
    public boolean update(long id, ArtikulliDto dto) {
        var optionalEntity = artikulliRepository.findById(id);
        if (optionalEntity.isEmpty())
            throw new EntityNotFoundException("Artikulli me id "+id+" nuk u gjet");
        var entity = optionalEntity.get();
        entity.setName(dto.getName());
        entity.setDescription(dto.getDescription());
        entity.setPrice(dto.getPrice());
        entity.setStockQuantity(dto.getStockQuantity());
        entity.setInStock(dto.isInStock());
        entity.setProducedDate(dto.getProducedDate());
        entity.setExpirationDate(dto.getExpirationDate());
        artikulliRepository.save(entity);
        return true;
    }

    @Override
    public boolean deletedById(long id) {
        artikulliRepository.deleteById(id);
        return true;
    }
}
