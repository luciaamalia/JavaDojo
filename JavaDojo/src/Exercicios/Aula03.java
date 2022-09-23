package Exercicios;

import java.util.Date;

/*Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem 

Eu <Nome >, morando no end <end>,
confirmo que recebi o salário de <sal>, na data <data>

Aula03TiposPrimitivos
*/
public class Aula03 {

	public static void main(String[] args) {

		String nome = "Lúcia";
		String end = "Qr 122 Conj D 20 Sta Maria, Brasília, DF";
		float sal = 7000.0f;
		Date data = new Date();

		System.out.println("Eu " + nome + " morando no endereço " + end + ",\r\n" + "confirmo que recebi o salário de "
				+ sal + ", na data " + data);

	}

}
