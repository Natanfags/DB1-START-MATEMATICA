package br.com.matematica;

public class Program {

	private double divider = 0;

	public String calculateOddPair(Double entrada) {
		return (entrada % 2 == 0) ? "é par, não é ímpar, " : "é impar, não é par, ";

	}

	public String biggerThanTen(Double entrada) {
		return (entrada > 10) ? "é maior que 10," : "não é maior que 10,";
	}

	public String doubleOfInput(Double entrada) {
		return " o dobro de " + entrada + " é " + entrada * 2 + ", ";
	}

	public String checkPrimeNumber(Double entrada) {
		for (int i = 1; i <= entrada; i++) {
			if (entrada % i == 0) {
				divider++;
			}
		}
		return (divider == 2) ? "é primo." : "não é primo.";
	}
}