package comparable;

public class Buch implements Comparable<Buch> {
	String titel;
	String autor;
	int seiten;
	int jahr;
	
	public Buch(String titel, String autor, int seiten, int jahr) {
		this.titel = titel;
		this.autor = autor;
		this.seiten = seiten;
		this.jahr = jahr;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getSeiten() {
		return seiten;
	}

	public void setSeiten(int seiten) {
		this.seiten = seiten;
	}

	public int getJahr() {
		return jahr;
	}

	public void setJahr(int jahr) {
		this.jahr = jahr;
	}

	@Override
	public int compareTo(Buch b) {
		if(autor.compareTo(b.autor) == 0) {
			if(Integer.compare(jahr, b.jahr) < 0) {
				return -1;
			} else if (Integer.compare(jahr, b.jahr) > 0) {
				return 1;
			} else {
				return 0;
			}
		} else if (autor.compareTo(b.autor) < 0){
			return -1;
		} else {
			return 1;
		}
	}
	
	@Override
	public String toString() {
		return "Autor: " + autor + "; Titel: " + titel + "; Seiten: " + seiten + "; Jahr: " + jahr;
	}
}
