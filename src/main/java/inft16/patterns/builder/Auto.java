package inft16.patterns.builder;

public class Auto {

	private String name;
	private int leistungInPs;
	private boolean sportEdition;
	private String farbe;
	private int sitze;
	private int türen;
	private boolean ersatzReifen;
	private boolean dachFenster;
	
	public Auto(String name, int leistungInPs, boolean sportEdition, String farbe, int sitze, int türen, boolean ersatzReifen, boolean dachFenster) {
		this.name = name;
		this.leistungInPs = leistungInPs;
		this.sportEdition = sportEdition;
		this.farbe = farbe;
		this.sitze = sitze;
		this.türen = türen;
		this.ersatzReifen = ersatzReifen;
		this.dachFenster = dachFenster;
	}

	public String getName() {
		return name;
	}

	public int getLeistungInPs() {
		return leistungInPs;
	}

	public boolean isSportEdition() {
		return sportEdition;
	}

	public String getFarbe() {
		return farbe;
	}

	public int getSitze() {
		return sitze;
	}

	public int getTüren() {
		return türen;
	}

	public boolean isErsatzReifen() {
		return ersatzReifen;
	}

	public boolean isDachFenster() {
		return dachFenster;
	}
	
}
