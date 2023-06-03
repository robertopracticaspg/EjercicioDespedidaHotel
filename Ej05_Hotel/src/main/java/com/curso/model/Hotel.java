package com.curso.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "hotel")
public class Hotel {

	@Id
	private int idHotel;
	private String nombre;
	private int categoria;
	private double precio;
	private boolean disponible;

	/**
	 * Constructor de la clase Hotel.
	 * 
	 * @param idHotel     El ID del hotel.
	 * @param nombre      El nombre del hotel.
	 * @param categoria   La categoría del hotel.
	 * @param precio      El precio del hotel.
	 * @param disponible  La disponibilidad del hotel.
	 */
	public Hotel(int idHotel, String nombre, int categoria, int precio, boolean disponible) {
		super();
		this.idHotel = idHotel;
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.disponible = disponible;
	}

	/**
	 * Constructor vacío de la clase Hotel.
	 */
	public Hotel() {
		super();
	}

	/**
	 * Obtiene el ID del hotel.
	 * 
	 * @return El ID del hotel.
	 */
	public int getIdHotel() {
		return idHotel;
	}

	/**
	 * Establece el ID del hotel.
	 * 
	 * @param idHotel El ID del hotel a establecer.
	 */
	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}

	/**
	 * Obtiene el nombre del hotel.
	 * 
	 * @return El nombre del hotel.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre del hotel.
	 * 
	 * @param nombre El nombre del hotel a establecer.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene la categoría del hotel.
	 * 
	 * @return La categoría del hotel.
	 */
	public int getCategoria() {
		return categoria;
	}

	/**
	 * Establece la categoría del hotel.
	 * 
	 * @param categoria La categoría del hotel a establecer.
	 */
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	/**
	 * Obtiene el precio del hotel.
	 * 
	 * @return El precio del hotel.
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Establece el precio del hotel.
	 * 
	 * @param precio El precio del hotel a establecer.
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	/**
	 * Verifica si el hotel está disponible.
	 * 
	 * @return true si el hotel está disponible, false de lo contrario.
	 */
	public boolean isDisponible() {
		return disponible;
	}

	/**
	 * Establece la disponibilidad del hotel.
	 * 
	 * @param disponible La disponibilidad del hotel a establecer.
	 */
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

}
