package com.cip.prog;

import javax.swing.JOptionPane;

public class Practica_unidad_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = (int)(Math.random()*50)+1;
		
		int adivina = Integer.parseInt(JOptionPane.showInputDialog("Introdusca un numero:"));
			
		int intentos = 0;
		
		while(numero != adivina) {
			
			intentos ++;
			
			if(numero < adivina) {
				JOptionPane.showMessageDialog(null, "Su numero es mayor");
				
			}
			else if (numero > adivina) {
				JOptionPane.showMessageDialog(null, "Su numero es menor");
				
			}
							
			adivina = Integer.parseInt(JOptionPane.showInputDialog("Introdusca un numero:"));	
			
		
		
		}
		if (numero == adivina) {
			System.out.println("Es usted un hacha " +intentos+" intentos necesito");
		}
		
		System.out.println("el numero es "+ numero);

	}

}
