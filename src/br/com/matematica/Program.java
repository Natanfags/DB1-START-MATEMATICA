package br.com.matematica;

public class Program {

	private double divider = 0;

	public String calculateOddPair(Double entrada) {
		return (entrada % 2 == 0) ? "� par, n�o � �mpar, " : "� impar, n�o � par, ";

	}

	public String biggerThanTen(Double entrada) {
		return (entrada > 10) ? "� maior que 10," : "n�o � maior que 10,";
	}

	public String doubleOfInput(Double entrada) {
		return " o dobro de " + entrada + " � " + entrada * 2 + ", ";
	}

	public String checkPrimeNumber(Double entrada) {
		for (int i = 1; i <= entrada; i++) {
			if (entrada % i == 0) {
				divider++;
			}
		}
		return (divider == 2) ? "� primo." : "n�o � primo.";
	}
}