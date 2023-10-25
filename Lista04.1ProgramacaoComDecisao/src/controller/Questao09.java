package controller;

import util.Teclado;

public class Questao09 {
	/*
	 * 9) Desenvolver um programa que pergunte um número e exiba a informação de que ele é positivo, negativo ou
nulo.
	 */
	public static void main(String[] args) {
		
		int num ; 
		num = Teclado.lerInt("Informe um numero");
		
		if ( num > 0 ) {// se o numero for maior do que zero  
		System.out.println( num + " É positivo.");
		} else  //fim do primeiro if else
		if ( num < 0 ) {
			System.out.println(num + " é negativo");
		}else {
				System.out.println( num +" Zero é nulo");
			}
		}
		

	}


