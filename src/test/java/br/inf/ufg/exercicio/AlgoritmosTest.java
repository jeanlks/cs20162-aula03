package br.inf.ufg.exercicio;

import static org.junit.Assert.*;

import org.junit.Test;

import br.inf.ufg.exercicio.Algoritmos;

public class AlgoritmosTest {

	@Test(expected = IllegalArgumentException.class)
	public void fatorialNumeroMenorQue1Test() {
		Algoritmos.fatorial(-1);
	}

	@Test
	public void fatorialTest() {
		assertEquals(6, Algoritmos.fatorial(3));
	}

	

	// Testes para raiz quadrada
	@Test
	public void raizQuadradaTest() {
		assertEquals(2, Algoritmos.raiz(4, 1));
	}
	
	//Testes para fibonacci
	@Test
	public void fibonacciTest(){
		assertEquals(55,Algoritmos.fibonacci(10));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void fibonacciWrongParametersTest(){
		Algoritmos.fibonacci(-1);
	}
}
