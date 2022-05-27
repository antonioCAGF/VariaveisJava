package br.com.tipos;

import java.util.Scanner;

public class TestandoTipos {
	public static void main(String[] args) {
		
		// Instagram: @pikdev_

		// Youtube: @Pikachu Gamer
		
		// GitHub: @antonioCAGF
		
		// Linkedin: https://www.linkedin.com/in/antonio-guimar%C3%A3es-007ba61a8

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Como funciona o tipo int?");
		System.out.println();
		System.out.println(
				"Declarar valores do tipo inteiro (int), isso vale para n�meros que n�o possuem casas decimais");
		System.out.println();
		System.out.println("Exemplo:");
		System.out.println();
		System.out.println("Digite apenas um n�mero qualquer: ");
		int um = keyboard.nextInt();
		System.out.println("Voc� acabou de digitar um valor inteiro: " + um);

		System.out.println();
		System.out.println("Para que serve o a declara��o double?");
		System.out.println();
		System.out.println("Declarar valores do tipo double, isso vale para n�meros com casas decimais");
		System.out.println();
		System.out.println("Exemplo:");
		System.out.println();
		System.out.println("Digite um valor com uma casa decimal (acrescente v�rgula, Exemplo: 2,5): ");
		double dois = keyboard.nextDouble();
		System.out.println("Voc� acabou de digitar um valor double: " + dois);

		System.out.println();
		System.out.println("Para que serve uma String?");
		System.out.println();
		System.out.println("Tipo String, isso serve para utilizar textos, nomes etc...");
		System.out.println();
		System.out.println("Exemplo:");
		System.out.println();
		System.out.println("Digite seu nome por exemplo");
		String generico = keyboard.next();
		System.out.println("Voc� acabou de digitar um tipo String: " + generico);

		System.out.println();
		System.out.println("Para que serve a declara��o char?");
		System.out.println();
		System.out.println("Tipo char, isso serve para utilizar apenas um caracter");
		System.out.println();
		System.out.println("Exemplo:");
		System.out.println();
		System.out.println("Digite uma letra ou um n�mero");
		String caracter = keyboard.next();
		System.out.println("Voc� acabou de digitar um valor Char: " + caracter);
		System.out.println();
		System.out.println("Fim do programa! Agora voc� j� sabe na pr�tica os principais tipos de vari�veis e como utiliza-l�s");
		System.out.println();
		System.out.println("Boa sorte e bons estudos!! :D");
	}
}
