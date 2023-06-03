package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Hotel;

import com.curso.service.HotelService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class HotelController {

	@Autowired
	HotelService service;

	/**
	 * Obtiene la lista completa de hoteles.
	 * 
	 * @return La lista de hoteles.
	 */
	// endpoint
	// http://localhost:8080/hoteles GET
	@ApiOperation(value = "Devuelve la lista con todos los hoteles en formato JSON", notes = "Si necesito explicar con más detalle lo hago aqui")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "OK. El recurso se obtiene correctamente", response = Hotel.class),
			@ApiResponse(code = 404, message = "Método no permitido."),
			@ApiResponse(code = 500, message = "Error inesperado del sistema") })
	@GetMapping(value = "hoteles", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Hotel> hotel() {
		return service.hotel();
	}

	// endpoint
	// http://localhost:8080/hoteles/Melia GET
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
