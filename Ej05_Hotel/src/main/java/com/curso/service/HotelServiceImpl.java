package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.HotelDao;
import com.curso.model.Hotel;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired	
	HotelDao dao;
	
	@Override
	public List<Hotel> hotel() {
		return dao.findAll(); // Retorna toda la lista de hoteles
	}

	/**
	 * Busca un hotel por su nombre.
	 * 
	 * @param nombre El nombre del hotel a buscar.
	 * @return El hotel encontrado o null si no se encuentra.
	 */
	@Override
	public Hotel buscarHotelPorNombre(String nombre) {
		return dao.findByNombre(nombre);
	}
}
