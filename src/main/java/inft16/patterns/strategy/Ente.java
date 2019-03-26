package inft16.patterns.strategy;

public abstract class Ente {
	
	public abstract void quaken();
	
	public abstract void zeigen();
	
	public void schwimmen() {
		System.out.println("Plantsch, Plantsch...");
	}
	
}
