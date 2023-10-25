package controller;

import util.Teclado;

public class Questao01 {

	/*
	 * 1) Desenvolver um programa que pergunte um número. Se este número for maior
	 * que 20, então ele deverá exibir a metade deste número, senão, ele deverá
	 * exibir o número sem alterações.
	 */
	public static void main(String[] args) {
		
		double num;
		
		num= Teclado.lerDouble("informe um numero");
		
		 if (num > 20) {
			 System.out.println("A metade do valor inserido é " + (num / 2) );
		 }else {
			 System.out.println("o numerp inserido foi " + num);
			 
		 }

	}

}
