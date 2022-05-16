package br.com.firstproject;

import br.com.firstproject.model.Teste;

public class FirstProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Teste teste = new Teste("Andrew", "Branco", 30);
		Livros livros = new Livros();

		System.out.println(teste);
		System.out.println(livros);

		/*
		 * int a = 3; int b = 4; System.out.println("Hello World " + (a+b));
		 */
	}

}

class Livros {
	
	private String nome;
	private String npag;
}
