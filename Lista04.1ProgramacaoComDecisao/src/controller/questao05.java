package controller;

import util.Teclado;

public class questao05 {
	/*
	 * 5) Desenvolver um programa que pergunte 4 notas escolares de um aluno e exiba
	 * mensagem informando que o aluno foi aprovado se a média escolar for maior ou
	 * igual a 5. Se o aluno não foi aprovado, indicar uma mensagem informando essa
	 * condição. Apresentar junto com a mensagem de aprovação ou reprovação o valor
	 * da média obtida pelo aluno.
	 */
	public static void main(String[] args) {
		
		double n1, n2, n3, n4, media;
		String situacao;
		
		
		n1 = Teclado.lerDouble("Informe a nota 1 ");
		n2 = Teclado.lerDouble("Informe a nota 2 ");
		n3 = Teclado.lerDouble("Informe a nota 3 ");
		n4 = Teclado.lerDouble("Informe a nota 4 ");
	
		media = (n1 + n2 + n3 + n4) / 4;
	
		if ( media >= 5 ) {
		situacao = "Aprovado!!";	
		} else {
			situacao = "Reprovado";
		}
		System.out.println("-------------------------");
		System.out.println("Nota 1: " + n1);
		System.out.println("Nota 2: " + n1);
		System.out.println("Nota 3: " + n1);
		System.out.println("Nota 4: " + n1);
		System.out.println("Média: " + media);
		System.out.println("situacao : " + situacao);
	}
	
	
	
	
	
	
	

}
