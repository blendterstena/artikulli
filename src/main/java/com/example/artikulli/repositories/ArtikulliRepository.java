package com.example.artikulli.repositories;

import com.example.artikulli.models.Artikulli;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtikulliRepository extends JpaRepository<Artikulli,Long> {
}
