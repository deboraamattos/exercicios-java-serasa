// Considerando que A = 5, B = 8 e C = 10, calcule e imprima o valor das seguintes expressões:
// • Y = X * A
// • X = A + (2 * B) / (C - 6)

package lista1;

public class Exercicio15 {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 8;
		int c = 10;
		
		int x = a + (2 * b)/(c - 6);
		int y = x * a;
		
		System.out.println("X = " + x);
		System.out.println("Y = " + y);
		
	}

}
