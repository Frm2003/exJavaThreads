package ex03.controller;

public class thread extends Thread {
	
	int soma, vet[] = new int[5];
	
	public thread(int[] vet) {
		for (int i = 0; i < vet.length; i++) {
			this.vet[i] = vet[i];
		}
	}

	@Override
	public void run() {
		for (int i = 0; i < vet.length; i++) {
			soma += vet[i];
		}
		System.out.println("Tag: " + getId() + " | soma: " + soma);
	}
}
