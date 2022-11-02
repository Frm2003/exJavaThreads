package ex02.controller;

public class threads extends Thread {
	
	public threads() {
		super();
	}

	@Override
	public void run() {
		System.out.println("id: " + getId());
	}
}
