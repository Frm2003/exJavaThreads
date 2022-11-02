package ex03.view;

import ex03.controller.thread;

public class main {
	
	public static void main(String[] args) {
		int[][] m = new int[3][5];
		int line[] = new int[5];

		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 5; c++) {
				m[l][c] = (int) (Math.random() * 10) + 1;
				line[c] = m[l][c];
			}
			Thread t = new thread(line);
			t.start();
		}
	}
}
