package inft16.patterns.strategy;

public class StockEnte extends Ente {

	@Override
	public void quaken() {
		System.out.println("Quak!");
	}

	@Override
	public void zeigen() {
		System.out.println("Ich bin eine Stockente.");
	}

}
