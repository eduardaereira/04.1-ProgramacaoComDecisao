package controller;

import util.Teclado;

public class Questao08 {
	/*
	 * 8) Desenvolver um programa que pergunte um número inteiro qualquer e
	 * verifique se ele está na faixa de 1 a 10.
	 */
	public static void main(String[] args) {

		int num ;
		num = Teclado.lerInt("informe um numero inteiro qualquer");
		
		if ( (num >= 1) && (num <= 10) ) {
			System.out.println( num + " Esta na faixa de 1 a 10");
		}else {
			System.out.println( num + " Não esta na faixa de 1 a 10");
		}
		
		
	}

}
