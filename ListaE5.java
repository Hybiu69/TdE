package backend;

import java.util.Scanner;

public class ListaE5 {

	public static void main(String[] args) {

		int divisor,dividendo,resto;
		
		Scanner ler = new Scanner (System.in);
		divisor=10;
		System.out.println("Digite um número: ");
		dividendo=ler.nextInt();
		
		try {
			resto=divisor/dividendo;
			System.out.println("O resto é: "+resto);
		}
		catch (Exception erro) {
			System.out.println("Não existe divisão por zero" );
			System.exit(0);
		}
		
		ler.close();
	}

}
