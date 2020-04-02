package org.formacion.isp;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestProcesadorTexto {

	@Test
	public void test_simple() {
		
		// Esta instancia no contiene las características de CorrectorTexto
		ProcesadorTexto procesador = new ProcesadorCorrectorTexto();
		
		procesador.nueva("No");
		procesador.nueva("himporta");
		procesador.nueva("la");
		procesador.nueva("hortografia");
		
		assertEquals("No himporta la hortografia", procesador.texto());
	}
	
	@Test
	public void test_con_idioma() {
		
		ProcesadorCorrectorTexto procesador_con_idioma = new ProcesadorCorrectorTexto();
		
		procesador_con_idioma.nueva("Tengo");
		procesador_con_idioma.nueva("hambre");
		
		assertEquals("Tengo hambre", procesador_con_idioma.texto());
		
		assertTrue(procesador_con_idioma.correcto(Idioma.ES));
	}
}
