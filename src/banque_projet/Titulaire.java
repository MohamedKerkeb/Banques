package banque_projet;

public class Titulaire {
	
	private int code;
	private String prenon;
	private String nom;
	private String adresse;
	private int codePostal;
	public Titulaire(int code, String prenon, String nom, String adresse, int codePostal) {
		super();
		this.code = code;
		this.prenon = prenon;
		this.nom = nom;
		this.adresse = adresse;
		this.codePostal = codePostal;
	}
	
	public Titulaire() {
		// TODO
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getPrenon() {
		return prenon;
	}

	public void setPrenon(String prenon) {
		this.prenon = prenon;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	@Override
	public String toString() {
		return "Titulaire [code=" + code + ", prenon=" + prenon + ", nom=" + nom + ", adresse=" + adresse
				+ ", codePostal=" + codePostal + "]";
	}
	
	
}
