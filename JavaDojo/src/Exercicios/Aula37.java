package Exercicios;

public class Aula37 {

	public static void main(String[] args) {
		// Arrays Multidimensionais
		int[][] arrayInt= new int [3][];
		
		arrayInt[0] = new int[2];
		arrayInt[1] = new int[3];
		arrayInt[2] = new int[6];
		
		
		for (int[] arrayBase: arrayInt) {
			for (int num: arrayBase) {
				System.out.println(num);
			}
		}

	}

}
