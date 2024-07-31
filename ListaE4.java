package backend;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaE4 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList <>();

		System.out.println("Quantos números você vai somar?");
		int index = ler.nextInt();

		int numero;

		for(int i =0;i<index;i++) {
			System.out.println("Insira os números");
			numero = ler.nextInt();
			numeros.add(numero);
		}
		for(int i : numeros) {
			System.out.println(i);
			if(i%2==0) {
				System.out.println("Este número é par: " +i);
			}
		}
		
		
		ler.close();

	}

}