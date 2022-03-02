package com.sinensia.servicios;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalTime;

import com.sinensia.entidades.Acciones;

public class Metodos {

	public static final String SEPARATOR = ",";

	public static void DescargaFichero(String FILE_URL, String FILE_NAME) {
		try (BufferedInputStream in = new BufferedInputStream(new URL(FILE_URL).openStream());
				FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME)) {
			byte dataBuffer[] = new byte[1024];
			int bytesRead;
			while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
				fileOutputStream.write(dataBuffer, 0, bytesRead);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

	public static Acciones LecturaFichero(String FILE_URL, String FILE_NAME) throws FileNotFoundException, IOException {
		Acciones acc = new Acciones();
		boolean FirstLine = true;
		try (BufferedReader br = new BufferedReader(new FileReader(FILE_URL + FILE_NAME))) {
			String line = br.readLine();
			while (null != line) {
				String[] fields = line.split(SEPARATOR);
				line = br.readLine();
				if (FirstLine) {
					FirstLine = false;
					continue;
				}
				acc.setUltimaFecha(LocalDate.parse(fields[0]));
				acc.setNombre(FILE_NAME);
				acc.setDate(LocalTime.now());
				acc.setCierre(Double.parseDouble(fields[4]));
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return acc;
	}

}
