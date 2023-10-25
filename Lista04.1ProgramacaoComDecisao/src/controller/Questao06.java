package controller;

import util.Teclado;

public class Questao06 {
	/*
	 * 6) Desenvolver um programa que pergunte dois valores numéricos inteiros e
	 * apresente o valor da diferença entre o maior valor e o menor valor lido.
	 */
	public static void main(String[] args) {

		int num1, num2;
		
		num1 = Teclado.lerInt("insira um número: ");
		num2 = Teclado.lerInt("Insira outra número:");
	
	if ( num1 > num2 ) { 
		System.out.println("Subtração : " + ( num1 - num2 ));
	}else {
	System.out.println("Subtração : " + (num2 - num1 ));	
	}
	}

}
