package backend;

import java.util.ArrayList;

public class ListaE6 {

	public static void main(String[] args) {

		ArrayList<String> nomes = new ArrayList<>();
		try {
			nomes.add("Alice");
			nomes.add("Bob");
			nomes.add("Charlie");
			System.out.println("Nome: "+nomes.get(5));
		}
		catch(Exception erro) {
			System.out.println("Puxar elementos existentes");
			System.exit(0);
		}
	}

}
