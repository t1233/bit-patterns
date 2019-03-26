package inft16.patterns.strategy;

public class Main {

	public static void main(String[] args) {
		StockEnte stockEnte = new StockEnte();
		GummiEnte gummiEnte = new GummiEnte();
		Ente[] enten = {stockEnte, gummiEnte};
		
		for(Ente ente : enten) {
			ente.zeigen();
			ente.quaken();
			ente.schwimmen();
		}
	}

}
