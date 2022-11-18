package com.akzio.servicio;

import java.util.List;

import org.springframework.stereotype.Service;

import com.akzio.modelo.deporte;

@Service
public interface deporteServicio {

	public List<deporte> MostrarTodosLosDeportes();
    
}
