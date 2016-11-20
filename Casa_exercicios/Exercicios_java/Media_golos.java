package Exercicios_java;

import java.util.Scanner;

public class Media_golos {

	public Media_golos() {
		
		int golos,somagolos=0;
		
		System.out.println("Bem vindo ao futbol de praia");
		
		String equipas[] = {"Panda","Caricas","Bob","Pocoyo"};
		
		for(int i=0;i<=2;i++){
			for(int j=i +1;j<=3;j++){
				
				if(equipas[i] == equipas[j]){
					
				}else{
					
				System.out.println("Jogo : " + equipas[i] + " - " + equipas[j] );
				System.out.println( equipas[i] + " Golos : ");
				golos = new Scanner(System.in).nextInt();
				System.out.println( equipas[j] + " Golos : ");
				golos = new Scanner(System.in).nextInt();
				
				somagolos = somagolos + golos;
				}
				
				
			
			}
			
		}
		System.out.println("A media dos golos foi :" + somagolos/12);
			
	}

}