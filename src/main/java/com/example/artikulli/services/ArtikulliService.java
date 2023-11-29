package com.example.artikulli.services;

import com.example.artikulli.dto.ArtikulliDto;

import java.util.List;

public interface ArtikulliService {
    boolean add(ArtikulliDto artikulliDto);
    List<ArtikulliDto> getAll();
    ArtikulliDto getById(long id);
    boolean update(long id, ArtikulliDto updatedArtikulliDto);
    boolean deletedById(long id);

}
