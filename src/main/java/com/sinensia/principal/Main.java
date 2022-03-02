package com.sinensia.principal;

import com.sinensia.servicios.Threads;

public class Main {

	public static void main(String[] args) {
		long init = System.currentTimeMillis(); 
		Threads.EjecucionThreads();
		long fin = System.currentTimeMillis();	
        System.out.println("Tiempo total de procesamiento: "+(fin-init)/1000+" Segundos");

	}
}