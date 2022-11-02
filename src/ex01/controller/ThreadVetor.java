package ex01.controller;

public class ThreadVetor extends Thread {
	
	int vet[] = new int[1000], nCod;
	
	public ThreadVetor(int[] vet, int nCod) {
		this.nCod = nCod;
		for (int i = 0; i < vet.length; i++) {
			this.vet[i] = vet[i];
		}
		
	}

	@Override
	public void run() {
		StringBuffer buffer = new StringBuffer();
		
		double tInit = System.nanoTime();
		
		switch (nCod) {
			case 0:
				for (int i = 0; i < vet.length; i++) { buffer.append(vet[i]); }
			break;

			default:
				for (int i : vet) { buffer.append(vet[i]); }
			break;
		}
		
		double tFinal = System.nanoTime();
		
		System.out.print("id - " + getId() + "/ tempo: " + (tFinal - tInit) / Math.pow(10, 9) + "\n");	
	}

}
