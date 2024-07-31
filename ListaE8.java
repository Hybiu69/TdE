package backend;

import java.util.Scanner;

public class ListaE8 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner ( System.in);
		
		double v1=0,v2=0,v3=0;
		try {
		System.out.println("Informe o valor 1: ");
		v1=ler.nextInt();
		System.out.println("Informe o valor 1: ");
		v3=ler.nextInt();
		System.out.println("Informe o valor 1: ");
		v2=ler.nextInt();
		
		if( v1==v2 && v1==3)
			System.out.println("Todos os números são iguais");
		else if (v1>v2 && v1>v3)
			System.out.println(+v1+" é o maior valor");
		else if (v2>v3)
			System.out.println(+v2+" é o maior valor");
		else
			System.out.println(+v3+" é o maior valor");
		}
		catch (Exception erro) {
			System.out.println("Insira um valor numérico");
			System.exit(0);
		}
		
		ler.close();
	}

}
