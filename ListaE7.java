package backend;

import java.util.Scanner;

public class ListaE7 {

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);
		double x;
		try {
			System.out.println("Digite uma nota: ");
			x=ler.nextDouble();

			if (x>0 && x>10) {
				System.out.println("Resultado Inválido");
			}

			if(x>=6 && x==10) 
				System.out.println("Você está aprovado");

			else if(x<6 && x>=4) 
				System.out.println("Exame");

			else 
				System.out.println("Reprovado");

			ler.close();
		}
		
		catch (Exception erro) {
			System.out.println("Insira um valor númerico");
			System.exit(0);
		}
	}
}