package br.com.matematica;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Double entrada = sc.nextDouble();

		Program regra = new Program();

		System.out.print(regra.calculateOddPair(entrada));
		System.out.print(regra.biggerThanTen(entrada));
		System.out.print(regra.doubleOfInput(entrada));
		System.out.print(regra.checkPrimeNumber(entrada));

		sc.close();

	}

}
