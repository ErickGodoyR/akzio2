package com.akzio.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akzio.modelo.deporte;

@Repository
public interface deporteRepositorio extends JpaRepository<deporte, Integer>{

}
