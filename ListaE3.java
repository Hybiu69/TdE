package backend;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaE3 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList <>();

		System.out.println("Quantos números você vai somar?");
		int index = ler.nextInt();

		int numero,soma=0;

		for(int i =0;i<index;i++) {
			System.out.println("Insira os números");
			numero = ler.nextInt();
			soma=soma+numero;
			numeros.add(soma);
		}
		
		System.out.println();
		
		for(int i : numeros) {
			System.out.println(i);
		}
		System.out.println("O resultado da soma é = "+soma);
		
		ler.close();
	}
}