package com.sinensia.servicios;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.sinensia.entidades.Acciones;

public class Threads {

	public static void EjecucionThreads() {

		ExecutorService executor = Executors.newFixedThreadPool(7);
		Future<Acciones> future1 = executor
				.submit(() -> link("https://query1.finance.yahoo.com/v7/finance/download/BTC?", "BTC.csv"));
		Future<Acciones> future2 = executor
				.submit(() -> link("https://query1.finance.yahoo.com/v7/finance/download/BTC-EUR?", "BTC-EUR.csv"));
		Future<Acciones> future3 = executor
				.submit(() -> link("https://query1.finance.yahoo.com/v7/finance/download/MSFT?", "MSFT.csv"));
		Future<Acciones> future4 = executor
				.submit(() -> link("https://query1.finance.yahoo.com/v7/finance/download/GOOG?", "GOOG.csv"));
		Future<Acciones> future5 = executor
				.submit(() -> link("https://query1.finance.yahoo.com/v7/finance/download/TSLA?", "TSLA.csv"));
		Future<Acciones> future6 = executor
				.submit(() -> link("https://query1.finance.yahoo.com/v7/finance/download/NVDA?", "NVDA.csv"));
		Future<Acciones> future7 = executor
				.submit(() -> link("https://query1.finance.yahoo.com/v7/finance/download/AAPL?", "AAPL.csv"));
		try {
			System.out.println(future1.get().toString());
			System.out.println(future2.get().toString());
			System.out.println(future3.get().toString());
			System.out.println(future4.get().toString());
			System.out.println(future5.get().toString());
			System.out.println(future6.get().toString());
			System.out.println(future7.get().toString());
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}

	private static Acciones link(String FILE_URL, String FILE_NAME) throws FileNotFoundException, IOException {
		Metodos.DescargaFichero(FILE_URL, FILE_NAME);
		Acciones acc = Metodos.LecturaFichero("C:\\Users\\aguci\\eclipse-workspace\\accionesproject\\", FILE_NAME);

		return acc;

	}

}
