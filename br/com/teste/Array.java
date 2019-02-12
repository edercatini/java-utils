package br.com.teste;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class Array {

	private static final Integer ONE_DIMENSION_INDEX = 10;
	private static final Integer TWO_DIMENSION_INDEX = 3;

	// Manipula��o e Impress�o de arrays em diferentes dimens�es
	public static void main(String[] args) {
		oneDimensionArray();
		twoDimensionArray();
	}

	// Array com uma dimens�o
	public static void oneDimensionArray() {
		Integer[] array = new Integer[ONE_DIMENSION_INDEX];

		for (Integer i = 0; i < ONE_DIMENSION_INDEX; i++) {
			array[i] = parseInt(showInputDialog("Informe o valor da " + (i + 1) + "� posi��o:"));
		}

		for (Integer j : array) {
			System.out.println(j);
		}
	}

	// Array com duas dimens�es
	public static void twoDimensionArray() {
		Integer[][] array = new Integer[TWO_DIMENSION_INDEX][TWO_DIMENSION_INDEX];
		Integer i = 0;
		Integer j = 0;

		for (i = 0; i < TWO_DIMENSION_INDEX; i++) {
			for (j = 0; j < TWO_DIMENSION_INDEX; j++) {
				array[i][j] = parseInt(showInputDialog("Informe o valor da posi��o [" + i + "][" + j + "]"));
			}
		}

		for (i = 0; i < TWO_DIMENSION_INDEX; i++) {
			for (j = 0; j < TWO_DIMENSION_INDEX; j++) {
				System.out.println("Array[" + i + "][" + j + "] = " + array[i][j]);
			}
		}
	}
}