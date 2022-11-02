package ex02.view;

import ex02.controller.threads;

public class main {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			Thread t = new threads();
			t.start();
		}
	}
}
