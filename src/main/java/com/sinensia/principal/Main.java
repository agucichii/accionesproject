package com.sinensia.principal;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import com.sinensia.entidades.Acciones;
import com.sinensia.servicios.Metodos;

public class Main {

	private static final String FILE_NAME = "GOOG.csv";
	private static final String FILE_URL = "https://query1.finance.yahoo.com/v7/finance/download/GOOG?";

	public static void main(String[] args) {

		Metodos met = new Metodos();

		try {
			met.DescargaFichero(FILE_URL, FILE_NAME);
			Acciones valores = met.LecturaFichero("C:\\Users\\aguci\\eclipse-workspace\\accionesproject\\", FILE_NAME);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
