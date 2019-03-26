package inft16.patterns.strategy;

public class GummiEnte extends Ente {

	@Override
	public void quaken() {
		System.out.println("Quiiiiitsch!");
	}

	@Override
	public void zeigen() {
		System.out.println("Ich bin eine gelbte Gummiente.");
	}

}
