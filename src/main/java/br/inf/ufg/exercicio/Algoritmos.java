package br.inf.ufg.exercicio;

/**
 * Algoritmos definidos como exercicio para aula2.
 * 
 * @author Jean
 */
public class Algoritmos {

	/**
	 * Algoritmo para soma de Naturais.
	 * 
	 * @param n
	 *            valor para soma dos numeros naturais
	 */

	public int somaNaturais(int n) {
		int i = 1;
		int s = 0;
		while (i <= n) {
			int d = 1 + (i ^ 2);
			s = s + 1 / d;
			i++;
		}
		return s;
	}

	public static double pi(int n) {
		int i = 1;
		int s = -1;
		int d = -1;
		int p = 0;
		while (i < n) {
			d = d + 2;
			s = -1 * s;
			p = p + 4 * s / d;
			i++;
		}
		return p;
	}

	/**
	 * Algoritmo para calculo de fatorial.
	 * 
	 * @param n
	 *            valor para calculo da fatorial
	 */
	public static int fatorial(int n) {
		if (n < 1) {
			throw new IllegalArgumentException("numero menor que zero");
		}
		int i = 2;
		int f = 1;
		while (i <= n) {
			f = f * i;
			i++;
		}
		return f;
	}

	/**
	 * Algoritmo para calculo de logaritmos naturais.
	 * 
	 * @param n
	 *            valor para calculo do logaritmo
	 * @param k
	 *            base para calculo do logaritmo
	 */
	public static double logaritmoNatural(double n, double k) {
		if (n < 1 || k < 2) {
			throw new IllegalArgumentException("n menor que 1 ou k menor que 2");
		}
		double p = 0;
		double f = 0;
		double i = 2;
		double e = n + 1;
		while (i <= k) {
			p = Math.pow(n, i);
			f = fatorial((int) i);
			e = e + p / f;
			i++;
		}
		return e;
	}

	/**
	 * Algoritmo para calculo de Razao Aurea.
	 * 
	 * @param x
	 *            valor para calculo do logaritmo
	 * @param y
	 *            base para calculo do logaritmo
	 * 
	 * @param k
	 * 
	 * 
	 */
	public static int razaoAurea(int x, int y, int k) {
		if (x < 0 || x < y || k < 0) {
			throw new IllegalArgumentException("n menor que 1 ou k menor que 2");
		}

		int c = y;
		int a = x;
		int i = 1;
		int t;
		while (i <= k) {
			t = c;
			c = c + a;
			a = t;
			i++;
		}
		return c / a;
	}

	/**
	 * Algoritmo para calculo de Quadrado Perfeito. base para calculo do
	 * logaritmo
	 * 
	 * @param k
	 *            valor para calculo do quadrado perfeito
	 * 
	 * 
	 */
	public boolean quadradoPerfeito(int k) {
		if (k < 1) {
			throw new IllegalArgumentException("k menor que 1");
		}
		int i = 1;
		int q = 1;
		while (q < k) {
			i = i + 2;
			q = q + i;
		}
		return q == k;
	}

	/**
	 * Algoritmo para calculo de resto de divisoes
	 * 
	 * @param x
	 *            valor de x para divisao
	 * @param y
	 *            valor de y para divisao
	 * 
	 */
	public int mod(int x, int y) {
		if (x < 0 || y < 0) {
			throw new IllegalArgumentException("x ou y menor que 0");
		}
		int s = x;
		while (y <= s) {
			s = s - y;
		}
		return s;
	}

	/**
	 * Algoritmo para calculo de raiz quadrada
	 * 
	 * @param n
	 *            valor do inteiro para calculo
	 * @param i
	 *            valor de indice para calculo
	 * 
	 */
	public static int raiz(int n, int i) {
		if (n <= 0) {
			throw new IllegalArgumentException("n menor que 0");
		}
		int r = 1;
		while (0 <= i) {
			r = (r + (n / r)) / 2;
			i--;
		}
		return r;
	}

	/**
	 * Algoritmo para calculo de funcao fibonacci
	 * 
	 * @param n
	 *            valor para calculo da funcao
	 * 
	 */
	public static int fibonacci(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("n menor que 0");
		}
		int a = 0;
		int c = 1;
		if ((n == 0) || (n == 1)) {
			return n;
		}
		int i = 2;
		int t;
		while (i <= n) {
			t = c;
			c = c + a;
			a = t;
			i++;
		}
		return c;
	}
}
