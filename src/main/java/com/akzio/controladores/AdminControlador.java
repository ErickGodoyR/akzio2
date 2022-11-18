package com.akzio.controladores;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.akzio.modelo.encuesta;
import com.akzio.servicio.AlmacenServicio;
import com.akzio.servicio.deporteServicio;


@Controller
@RequestMapping("/admin")
public class AdminControlador {

	@Autowired
	private AlmacenServicio servicio;
	
	@Autowired
	private deporteServicio depServicio;
	
	
	@GetMapping("")
	public String crearEncuesta(Model modelo) {
		encuesta encuesta = new encuesta();
		modelo.addAttribute("encuesta", encuesta);
		modelo.addAttribute("listaDeportes", depServicio.MostrarTodosLosDeportes());
		return "admin/index";
	}

	
	@PostMapping("")
	public String guardarEncuesta(@ModelAttribute("encuesta")encuesta encuesta) {
		  try {

				servicio.guardarEncuesta(encuesta);
				
				return "redirect:/admin?exito";
				}catch (Exception e) {
					 //System.out.println(e.getMessage());
					
	        }
		return "redirect:/admin?error";       
	    }
		 

}	
	

