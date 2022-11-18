package com.akzio.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akzio.modelo.deporte;
import com.akzio.repositorio.deporteRepositorio;

@Service
public class deporteServicioImpl implements deporteServicio{

	@Autowired
	deporteRepositorio deporteRepositorio;
	
	@Override
	public List<deporte> MostrarTodosLosDeportes() {
	
		return deporteRepositorio.findAll();
	}

}
