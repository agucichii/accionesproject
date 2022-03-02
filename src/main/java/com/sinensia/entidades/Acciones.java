package com.sinensia.entidades;

import java.time.LocalDate;
import java.time.LocalTime;

public class Acciones {

	LocalDate UltimaFecha;
	Double cierre;
	String nombre;
	LocalTime Date;

	
	public Acciones() {
		super();
	}


	public Acciones(LocalDate ultimaFecha, Double cierre, String nombre, LocalTime date) {
		super();
		UltimaFecha = ultimaFecha;
		this.cierre = cierre;
		this.nombre = nombre;
		Date = date;
	}


	public LocalDate getUltimaFecha() {
		return UltimaFecha;
	}


	public void setUltimaFecha(LocalDate ultimaFecha) {
		UltimaFecha = ultimaFecha;
	}


	public Double getCierre() {
		return cierre;
	}


	public void setCierre(Double cierre) {
		this.cierre = cierre;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public LocalTime getDate() {
		return Date;
	}


	public void setDate(LocalTime date) {
		Date = date;
	}


	@Override
	public String toString() {
		return "Acciones [Nombre de la acción: " + nombre + ", precio de cierre=" + cierre + ", fecha de cierre=" + UltimaFecha + ", Hora de compra=" + Date
				+ "]";
	}

}
