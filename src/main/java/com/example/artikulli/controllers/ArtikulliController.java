package com.example.artikulli.controllers;

import com.example.artikulli.dto.ArtikulliDto;
import com.example.artikulli.services.ArtikulliService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/artikulli")
@CrossOrigin(origins = "*")
public class ArtikulliController {
    private final ArtikulliService artikulliService;

    public ArtikulliController(ArtikulliService artikulliService) {
        this.artikulliService = artikulliService;
    }
    @GetMapping
    public List<ArtikulliDto> getAllDrivers() {
        return artikulliService.getAll();
    }

    @GetMapping("/{id}")
    public ArtikulliDto getDriverById(@PathVariable long id) {
        return artikulliService.getById(id);
    }

    @PostMapping
    public void addDriver(@RequestBody ArtikulliDto driverDto) {
        artikulliService.add(driverDto);
    }

    @PutMapping("/{id}")
    public void updateDriver(@PathVariable long id, @RequestBody ArtikulliDto driverDto) {
        artikulliService.update(id, driverDto);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id) {
        artikulliService.deletedById(id);
    }
}
