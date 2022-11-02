package ex01.view;

import javax.swing.JOptionPane;
import ex01.controller.ThreadVetor;

public class main {

	public static void main(String[] args) {
		int vet[] = new int[1000];
		
		for (int i = 0; i < vet.length; i++) {
			vet[i] = (int) (Math.random() * 100) + 1;
		}
		
		for (int i = 0; i < 2; i++) {
			Thread thread = new ThreadVetor(vet, i);
			thread.start();
		}
	}

}
