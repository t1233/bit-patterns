package inft16.patterns.observer;

public class WetterStation {

	private WetterAnzeige anzeige = new WetterAnzeige();
	private WetterVorhersage vorhersage = new WetterVorhersage();
	
	private double druck;
	private double temperatur;
	
	public void setDruck(double durck) {
		this.druck = durck;
		anzeigeAktualisieren();
	}
	
	public void setTemperatur(double temperatur) {
		this.temperatur = temperatur;
		anzeigeAktualisieren();
	}
	
	public void anzeigeAktualisieren() {
		anzeige.aktualisieren(druck, temperatur);
		vorhersage.aktualisieren(druck, temperatur);
	}
	
}
