package com.curso.service;

import java.util.List;

import com.curso.model.Hotel;

public interface HotelService {

	/**
	 * Obtiene la lista completa de hoteles.
	 * 
	 * @return La lista de hoteles.
	 */
	List<Hotel> hotel();

	/**
	 * Busca un hotel por su nombre.
	 * 
	 * @param nombre El nombre del hotel a buscar.
	 * @return El hotel encontrado o null si no se encuentra.
	 */
	Hotel buscarHotelPorNombre(String nombre);

}
