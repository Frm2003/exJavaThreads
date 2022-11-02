package ex04.controller;

import ex04.view.main;

public class threadSapo extends Thread {
	int qtdPulo = 0;
	int distMaxCorrida = 100;
	int distAtualCorrida = 0;
	static int lugar = 0;

	public threadSapo() {
		super();
	}

	public void velSapo() {
		int vel = (int) (Math.random() * 50) + 1;
		distAtualCorrida += vel; qtdPulo++;
		if (distAtualCorrida > distMaxCorrida) { distAtualCorrida = distMaxCorrida; }
	}

	public void delaySapo() {
		int delay = (int) (Math.random() * 5) + 1;
		try {
			sleep(delay * 1000 + 5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		if (delay < 3) { System.out.println("o sapo: " + getId() + " deu um super pulo" + " | delay de: " + (delay * 1000 + 5000)); }
		else if (delay > 3) {  System.out.println("o sapo: " + getId() + " escorregou na banana" + " | delay de: " + (delay * 1000 + 5000)); }
		else {  System.out.println("Não aconteceu nada com sapo: " + getId() + " | delay de: " + (delay * 1000 + 5000)); }
	}
	
	public void statsAtual() {
		System.out.println("sapo:" + getId() + " percorreu(cm):" + distAtualCorrida + " | faltam(cm): " + (distAtualCorrida - distMaxCorrida));
	}
	

	@Override
	public void run() {
		while (distAtualCorrida < distMaxCorrida) {
			velSapo();
			delaySapo();
			statsAtual();
		}
		lugar++;
		System.out.println("sapo:" + getId() + " terminou a corrida | pulos dados: " + qtdPulo + " | posição: " + lugar);
	}
}
