package com.unidantes.firsttask.controllers;

import com.unidantes.firsttask.models.dao.IOperadorDao;
import com.unidantes.firsttask.models.entity.Operacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class OperacionesController {
	
	@Autowired
	private IOperadorDao operadorDao;
	
	@RequestMapping ( value = { "", "/", "/index" }, method = RequestMethod.GET )
	public String index ( Model model ) {
		Operacion operacion = new Operacion ( );
		model.addAttribute ( "operador", operacion );
		model.addAttribute ( "titulo", "Tarea - 0 (Nivelación)" );
		
		return "index";
	}
	
	@RequestMapping ( value = "/sumar", method = RequestMethod.GET )
	public String sumar ( @RequestParam Map < String, String > allParams,
	                      Model model
	) {
		Double numeroA = Double.valueOf ( allParams.get ( "numeroA" ) );
		Double numeroB = Double.valueOf ( allParams.get ( "numeroB" ) );
		
		Operacion operacion = new Operacion ( );
		Double resultado = operadorDao.sumar ( numeroA, numeroB );
		operacion.setNumeroA ( numeroA );
		operacion.setNumeroB ( numeroB );
		operacion.setResultado ( resultado );
		operacion.setVisible ( true );
		model.addAttribute ( "operador", operacion );
		return "index";
	}
	
	@RequestMapping ( value = "/restar", method = RequestMethod.POST )
	public String restar ( @RequestParam Map < String, String > allParams,
	                       Model model
	) {
		Double numeroA = Double.valueOf ( allParams.get ( "numeroA" ) );
		Double numeroB = Double.valueOf ( allParams.get ( "numeroB" ) );
		
		Operacion operacion = new Operacion ( );
		Double resultado = operadorDao.resta ( numeroA, numeroB );
		operacion.setNumeroA ( numeroA );
		operacion.setNumeroB ( numeroB );
		operacion.setResultado ( resultado );
		operacion.setVisible ( true );
		model.addAttribute ( "operador", operacion );
		return "index";
	}
	
	@RequestMapping ( value = "/potencias", method = RequestMethod.POST )
	public String potencias ( @RequestParam Map < String, String > allParams,
	                          Model model
	) {
		Double numeroA = Double.valueOf ( allParams.get ( "numeroA" ) );
		Double numeroB = Double.valueOf ( allParams.get ( "numeroB" ) );
		
		Operacion operacion = new Operacion ( );
		Double resultado = operadorDao.potencias ( numeroA, numeroB );
		operacion.setNumeroA ( numeroA );
		operacion.setNumeroB ( numeroB );
		operacion.setResultado ( resultado );
		operacion.setVisible ( true );
		model.addAttribute ( "operador", operacion );
		return "index";
	}
}
