package inft16.patterns.observer;

public class WetterAnzeige {
	public void aktualisieren(double druck, double temperatur) {
		System.out.println("Aktuelle Temperatur: " + temperatur + " °C; Luftdurck: " + druck + " hPa");
	}
}
