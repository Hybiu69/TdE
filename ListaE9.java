package backend;

import java.util.Scanner;

public class ListaE9 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		try {
			System.out.println("Escolha um número entre 1 e 3");
			int numero=ler.nextInt();

			switch(numero) {
			case 1:
				System.out.println("O número escolhido foi 1");
				break;
			case 2:
				System.out.println("O númro escolhido foi 2");
				break;
			case 3:
				System.out.println("O número escolhido foi 3");
			default :
				System.out.println("Número inválido");
			}
		}
		catch (Exception erro){
			System.out.println("Insira um valor numérico, inteiro. (1,2 ou 3");
		}

	}

}