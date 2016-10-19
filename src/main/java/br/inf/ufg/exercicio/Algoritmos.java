package br.inf.ufg.exercicio;

/**
 * Algoritmos definidos como exercicio para aula2.
 *
 * @author Jean
 * @version 1.0
 */
public final class Algoritmos {

     /**
     * @param n
     *            número que se deseja saber a soma dos naturais
     *
     * @return soma dos números naturais até n
     */
public static int somaNaturais(final int n) {
    if (n <= 0) {
       throw new IllegalArgumentException("numero <0");
    }
    int i = 2;
    int s = 1;
    while (i <= n) {
     s = s + i;
     i++;
     }
return s;
}

/**
* Algoritmo para PI.
*
* @param n
*            valor para calculo do pi
* @return valor de pi
*/

public static double pi(final int n) {
     final int valorMultiplicacao = 4;
     if (n < 1) {
       throw new IllegalArgumentException("n menor que 1");
     }
     double i = 1.0;
     double s = -1.0;
     double d = -1.0;
     double p = 0.0;

   while (i <= n) {
     d = d + 2;
     s = -1 * s;
     p = p + valorMultiplicacao * s / d;
     i++;
    }
return p;
}

     /**
     * Algoritmo para calculo de fatorial.
     *
     * @param n
     *            valor para calculo da fatorial
     * @return valor de fatorial
     */
public static int fatorial(final int n) {
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

//  Não feito   /**
//     * Algoritmo para calculo de logaritmos naturais.
//     *
//     * @param n
//     *            valor para calculo do logaritmo
//     * @param k
//     *            base para calculo do logaritmo
//     * @return valor logaritmo
//     */
//public static double logaritmoNatural(final double n, final double k) {
//    if (n < 1 || k < 2) {
//      throw new IllegalArgumentException("n menor que 1 ou k menor que 2");
//    }
//   double p = 0;
//   double f = 0;
//   double i = 2;
//   double e = n + 1;
//   while (i <= k) {
//       p = Math.pow(n, i);
//       f = fatorial((int) i);
//       e = e + p / f;
//       i++;
//   }
//return e;
//}

    /**
     * Algoritmo para calculo de Razao Aurea.
     *
     * @param x
     *            valor para calculo do logaritmo
     * @param y
     *            base para calculo do logaritmo
     *
     * @param k valor de k para calculo.
     * @return razao aurea
     */
public static int razaoAurea(final int x, final int y, final int k) {
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
     * logaritmo.
     *
     * @param k
     *            valor para calculo do quadrado perfeito
     *@return valor quadrado perfeito.
     *
     */
public static boolean quadradoPerfeito(final int k) {
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
     * Algoritmo para calculo de resto de divisoes.
     *
     * @param x
     *            valor de x para divisao
     * @param y
     *            valor de y para divisao
     * @return valor de resto.
     */
public static int mod(final int x, final int y) {
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
     * Algoritmo para calculo de raiz quadrada.
     *
     * @param n
     *            valor do inteiro para calculo
     * @param i
     *            valor de indice para calculo
     * @return valor da raiz
     */
public static int raiz(final int n, final int i) {
     int index = i;
     if (n <= 0) {
        throw new IllegalArgumentException("n menor que 0");
       }
       int r = 1;
       while (0 <= index) {
         r = (r + (n / r)) / 2;
         index--;
    }
   return r;
}

     /**
     * Algoritmo para calculo de funcao fibonacci.
     *
     * @param n
     *           valor para calculo da funcao.
     * @return valor fibonacci
     */
public static int fibonacci(final int n) {
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

//  Não feito   /**
//     * Algoritmo para calculo de funcao horner.
//     * @param x
//     *            valor de x para calculo
//     * @param g
//     *            valor de g para calculo
//     *
//     * @param a
//     *        vetor para avaliacao do polinomio
//     * @return valor horner
//     *
//     */
//
//public static double horner(final int x, final int g, final int[] a) {
//        if (g <= 1) {
//         throw new IllegalArgumentException("Valor de g <=1");
//        }
//
//        int p = a.length;
//        int i = g - 1;
//
//        while (0 <= i) {
//          p = p * x + a[i];
//          i--;
//     }
//     return p;
//}

/**
* Restringe criação de instância.
*/
private Algoritmos() {
}

}
