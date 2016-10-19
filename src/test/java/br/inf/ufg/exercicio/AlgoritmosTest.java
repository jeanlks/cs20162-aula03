package br.inf.ufg.exercicio;

import static org.junit.Assert.*;

import org.junit.Test;

import br.inf.ufg.exercicio.Algoritmos;

public class AlgoritmosTest {
	
	//Testes para PI
	@Test(expected = IllegalArgumentException.class)
	public void piWrongParameterTest(){
		Algoritmos.pi(-1);
	}
	
	@Test
	public void piTest(){
		assertEquals(3.1416,Algoritmos.pi(1),1);
	}
	//Testes para fatorial
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
	
	//Testes para quadrado perfeito
	@Test
	public void quadradoPerfeitoTest(){
		assertTrue(Algoritmos.quadradoPerfeito(25));
	}
	@Test(expected = IllegalArgumentException.class)
	public void quadradoPerfeitoWrongValue(){
		Algoritmos.quadradoPerfeito(0);
	}
	@Test
	public void quadradoPerfeitoFalseResult(){
		assertFalse(Algoritmos.quadradoPerfeito(13));
	}
	
	

	
	
	//Testes para razao aurea
	@Test
	public void razaoAureaTest(){
		assertEquals(1.666, Algoritmos.razaoAurea(1, 1, 1),0.5);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void razaoAureaXSmallerThanYTest(){
		Algoritmos.razaoAurea(3, 5, 2);
	}
	@Test(expected = IllegalArgumentException.class)
	public void razaoAureaXSmallerThan0Test(){
		Algoritmos.razaoAurea(-3, -2, 10);
	}
	@Test(expected = IllegalArgumentException.class)
	public void razaoAureaKSmallerThan0Test(){
		Algoritmos.razaoAurea(20, -1, -1);
	}

	// Casos de teste para Soma dos Numeros naturais
	@Test
	public void valorArbitrarioParaSoma() {
		assertEquals(6.0, Algoritmos.somaNaturais(3),2.0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void numeroMenorQueZeroSomaNatural() {
		Algoritmos.somaNaturais(0);

	}

		@Test(expected = IllegalArgumentException.class)
		public void numeroMenoresQueZeroSomaNatural() {
			Algoritmos.somaNaturais(0);

		}
	
	
}
