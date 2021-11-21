package br.com.jorge.calculadora;


import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;

public class GuardaResultadoDaOperacao {

	public static void escrever(BigDecimal valor1, BigDecimal valor2, String operacao) throws IOException {
		FileWriter fw = new FileWriter("numeroscalculados.txt", true);
		fw.append(operacao + " de " + valor1 + " e " + valor2 + "\n");
		fw.close();
	}
}
