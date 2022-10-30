package aula8;

import java.util.Scanner;
import java.io.*;

public class ClasseExecutavel {
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double[][] matriz = new double[2][5];
		for (int linha = 0; linha < 2; linha++) {
			for (int coluna = 0; coluna < 5; coluna++) {
				System.out.println(ANSI_YELLOW + "Digite valores para sua MATRIZ " + ANSI_RESET);
				matriz[linha][coluna] = scan.nextDouble();
				System.out.println(ANSI_BLUE + "=================================" + ANSI_RESET);

			}

		}
		for (int linha = 0; linha < 2; linha++) {
			for (int coluna = 0; coluna < 5; coluna++) {
				System.out.print("[" + matriz[linha][coluna] + "]");

			}

			System.out.println("\n");

		}

	}

}
