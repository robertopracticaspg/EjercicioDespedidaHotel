package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Hotel;
import com.curso.service.HotelService;

@RestController
public class HotelController {

	@Autowired
	HotelService service;

	/**
	 * Obtiene la lista completa de hoteles.
	 * 
	 * @return La lista de hoteles.
	 */
	@GetMapping(value = "hoteles", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Hotel> hotel() {
		return service.hotel();
	}

	/**
	 * Obtiene los datos de un hotel por su nombre.
	 * 
	 * @param nombre El nombre del hotel a buscar.
	 * @return Los datos del hotel encontrado.
	 */
	@GetMapping(value = "hoteles/{nombre}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Hotel buscarHotelPorNombre(@PathVariable("nombre") String nombre) {
		return service.buscarHotelPorNombre(nombre);
	}
}
