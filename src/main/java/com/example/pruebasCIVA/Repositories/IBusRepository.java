package com.example.pruebasCIVA.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pruebasCIVA.Models.BusModel;

@Repository
public interface IBusRepository extends JpaRepository<BusModel, Long> {
}
