package ExerciciosPOO;

import java.util.Scanner;

public class ArtigoMain {

	public static void main(String args[]){

		double total = 0;
		Artigo artigo1 = new Artigo();
		Artigo artigo2 = new Artigo();
		Artigo artigo3 = new Artigo();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Bem Vindo a Loja");
		System.out.println("Introduza o nome do 1º Artigo");
		String nomeA1 = input.next();
		System.out.println("Introduza o preco do 1º Artigo");
		double precoA1 = input.nextInt();
		System.out.println("Introduza o nome do 2º Artigo");
		String nomeA2 = input.next();
		System.out.println("Introduza o preco do 2º Artigo");
		double precoA2 = input.nextInt();
		System.out.println("Introduza o nome do 3º Artigo");
		String nomeA3 = input.next();
		System.out.println("Introduza o preco do 3º Artigo");
		double precoA3 = input.nextInt();
		
		artigo1.setNome(nomeA1);
		artigo2.setNome(nomeA2);
		artigo3.setNome(nomeA3);
		
		artigo1.setPreco(precoA1);
		artigo2.setPreco(precoA2);
		artigo3.setPreco(precoA3);
		
		total = artigo1.getPreco() + artigo1.getPreco() + artigo1.getPreco();
		
		System.out.println("O valor total dos artigos e " + total + "€");
		
		
	}

}
