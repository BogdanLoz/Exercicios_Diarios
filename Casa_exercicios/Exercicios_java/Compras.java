package Exercicios_java;

import java.util.Scanner;

public class Compras {

	public Compras() {
		
		String artigo_nome;
		int artigo_valor,valorTotal = 0;
		
		System.out.println("Bem vindo a Loja");
		
		for(int i = 1;i <=3;i++){
			
			System.out.println("Introduza o nome do " + i + " artigo");
			artigo_nome = new Scanner(System.in).nextLine();
			System.out.println("Inroduza o valor do " + 1 + " artigo");
			artigo_valor = new Scanner(System.in).nextInt();
		
			valorTotal = valorTotal + artigo_valor;
			
		}
		
		System.out.println("Tera que pagar um total de " + valorTotal + "€");
	
	}

	


}


