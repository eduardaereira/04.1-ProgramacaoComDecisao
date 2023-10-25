package controller;

import util.Teclado;

public class Questao02 {
	/*
	 * Desenvolver um programa que permita ao aluno responder qual a capital do
	 * Brasil. O programa deverá exibir se a resposta está certa ou errada.
	 */
	public static void main(String[] args) {

		String capital;
		
		capital = Teclado.lerTexto("Qual é a capitão do Brasil");
		 if ( capital.equals ("Brasília")|| capital.equals ("brasília") ||
			capital.equals("Brasilia") || capital.equals("brasilia")) {
			System.out.println(" Parabens!! Você acertou");
			 
		 } else {
			 System.out.println("infelizmentte você errou:(");
		 }
		
		
		
		
	}

}
