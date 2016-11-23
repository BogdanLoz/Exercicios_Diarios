package Exercicios_java;

import java.util.Scanner;

public class CalcDespesas {

	public CalcDespesas() {
		
		double qtd,valor,media=0;
		String despesa; 
		
		System.out.println("Bem Vindo a calculadora de gastos");
		System.out.println("Quantas despesas mensais deseja inserir: ");
		qtd = new Scanner(System.in).nextInt();
		
		for(int i=0;i<qtd;i++){
			
			System.out.println("Introduza o nome da despesa: ");
			despesa = new Scanner(System.in).nextLine();
			
			System.out.println("Introduza o valor da despesa: ");
			valor = new Scanner(System.in).nextInt();
			
			media = media + valor;
		}
			
		
		System.out.println("Tera que fazer um investimento anual de " + media*12 +"€" +"\nO que equivale a " + media + "€ por mes");
		
	}

}
