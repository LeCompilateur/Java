package com.programme.java;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		
		System.out.println("\n\t\t\t Mini Calculatrice avec le Switch \n\n");
		
		while (true) {
				
				System.out.print("\n\nentrez le nombre 1  : ");
				
				int nombre1 = clavier.nextInt();
				
				System.out.print("entrez le nombre 2  : ");
				int nombre2 = clavier.nextInt();
				
				System.out.println("\n\t\t\t Que voulez-vous faire avec le nombre " + nombre1 +
						" et le nombre " + nombre2 + " ? :\n\n 1 pour + \n 2 pour - \n 3 pour * \n 4 pour /  \n 5 pour quittrer \n\n");
				
				int operation = clavier.nextInt();
				
				
				switch (operation) {
					
					case 1 : 
						System.out.println("l'addition des deux nombres donne " + (nombre1 + nombre2));
						break;
					
					case 2  : 
						System.out.println("la soustraction des deux nombres donne " + (nombre1 - nombre2));
						break;
						
					case 3  : 
						System.out.println("la multiplication des deux nombres donne " + (nombre1 * nombre2));
						break;
						
					case 4  : 
						if(nombre2 == 0) {
							System.out.println("Nous ne pouvons pas diviser un nombre par 0");
							break;
						}
						else {
							System.out.println("la division des deux nombres donne " + (nombre1 / nombre2));
							break;
						}
						
					case 5  : 
						clavier.close();
						System.out.println(" Au revoir à la prochaine !! ");
						System.exit(0);
						break;
						
						
					default :
						System.out.println("Choisissez un bon chiffre, Reprennez...!!");
						
				
				}
				
				
			}
			
			
		}
		
		

}

//Lorsqu'un cas correspond, il execute le reste du progamme, et pour empêcher celà, il faut utiliser le break
