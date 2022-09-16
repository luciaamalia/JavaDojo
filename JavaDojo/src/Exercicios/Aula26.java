package Exercicios;

public class Aula26 {

	public static void main(String[] args) {
		// utilizando switch e dados os valores de 1 a 7, impirima se e dia util ou fds
		//considere 1 como domingo

		byte dia = 4;
		switch (dia) {
		case 1:
		case 7: // sabado
			System.out.println("FDS");
			break;
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("Dia Util");
			break;
		default:
			System.out.println("Opção Inválida");
			break;
		}

	}

}
