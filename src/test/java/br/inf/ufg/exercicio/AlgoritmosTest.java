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
	@Test(expected = IllegalArgumentException.class)
	public void raizQuadradaWrongParametersTest(){
		Algoritmos.raiz(0, 1);
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
	
	@Test
	public void fibonacciValueEquals1(){
		assertEquals(1,Algoritmos.fibonacci(1));
	}

	@Test
	public void fibonacciValueEquals0(){
		assertEquals(0,Algoritmos.fibonacci(0));
	}
	
	//Testes para resto (MOD)
	@Test(expected = IllegalArgumentException.class)
	public void modWrongParametersTest(){
		Algoritmos.mod(-2,-1);
	}
	@Test
	public void modTest(){
		assertEquals(1, Algoritmos.mod(10, 3));
	}
}
