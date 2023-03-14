package com.pog.projeto.repository;

import com.pog.projeto.entity.HotelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacoteRepository extends JpaRepository<HotelEntity, Integer> {
}
