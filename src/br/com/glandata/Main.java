package br.com.glandata;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Main {

	public static void main(String[] args) {

		double valor = 0.3;
		System.out.println(valor * 3);

		BigDecimal numeroA = new BigDecimal("-0.5");
		BigDecimal numeroB = new BigDecimal("0.027");

		System.out.println("Soma : " + numeroA.add(numeroB));
		System.out.println("Subtracao: " + numeroB.subtract(numeroA));
		System.out.println("Comparacao: " + numeroB.compareTo(numeroA));
		System.out.println("Multiplicacao: " + numeroA.multiply(numeroB,MathContext.DECIMAL32));
		System.out.println("Divisao: " + numeroA.divide(numeroB, 4, RoundingMode.UP));
		System.out.println("Maximo: " + numeroB.max(numeroA));
		System.out.println("Minimo: " + numeroB.min(numeroA));
		System.out.println("Potencia: " + numeroB.pow(3));
		System.out.println("Inverte: " + numeroA.negate());
		System.out.println("Absoluto: " + numeroA.abs());
	}

}
