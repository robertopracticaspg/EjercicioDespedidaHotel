package com.curso.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.model.Hotel;

public interface HotelDao extends JpaRepository<Hotel, Integer> {
	
	/**
	 * Busca un hotel por su nombre.
	 * 
	 * @param nombre El nombre del hotel a buscar.
	 * @return El hotel encontrado o null si no se encuentra.
	 */
	Hotel findByNombre(String nombre);
}
