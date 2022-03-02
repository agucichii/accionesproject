package com.sinensia.entidades;

import java.time.LocalDate;

public class Acciones {

	LocalDate UltimaFecha;
	Double cierre;

	
	public Acciones() {
		super();
	}

	public Acciones(LocalDate ultimaFecha, Double cierre) {
		super();
		UltimaFecha = ultimaFecha;
		this.cierre = cierre;
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

	@Override
	public String toString() {
		return "Acciones [UltimaFecha=" + UltimaFecha + ", cierre=" + cierre + "]";
	}

}
