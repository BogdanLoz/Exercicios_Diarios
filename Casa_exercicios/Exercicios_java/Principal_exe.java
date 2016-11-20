package Exercicios_java;

import java.util.Scanner;

public class Principal_exe {

	public Principal_exe() {
		
	}
	
	
		public static void main(String[] args) {
		
			int opc;
			
			System.out.println("1 : Calculadora de Despesas");
			System.out.println("2 : Media de Golos");
			System.out.println("3 : Compras");
			opc = new Scanner(System.in).nextInt();
			
			switch(opc){
			
			case 1  :
			
					new CalcDespesas();
					break;
					
			case 2 : 
					new Media_golos();
					break;
					
					
			case 3 :
					new Compras();
					break;
			}
			
			
	
		}


}
