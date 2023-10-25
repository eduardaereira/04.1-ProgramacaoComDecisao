package controller;

import util.Teclado;

public class Questao04 {
	/*
	 * 4) Desenvolver um programa que pergunte um valor numérico inteiro e faça a
	 * exibição desse valor caso seja divisível por 4 e 5. Não sendo divisível por 
	 *4 e 5, o programa deverá exibir a mensagem “Valor não é divisível por 4 e 5”.
	 */

	public static void main(String[] args) {
		
		int num, div4, div5;
		
		num = Teclado.lerInt("Digite um número, por favor :");
		
		div4 = num % 4; // resto da divisão de num por 4
		div5 = num % 5;
		
		if ( num == 0 && div5 == 0 ) {
			System.out.println("");
		}
		
		
		

	}

}
