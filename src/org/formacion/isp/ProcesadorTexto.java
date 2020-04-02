package org.formacion.isp;

public interface ProcesadorTexto {

	// Añadir nueva palabra al procesador
	public void nueva (String palabra);
	
	// Convertir todas las palabras almacenadas en un texto
	public String texto ();
	
}
