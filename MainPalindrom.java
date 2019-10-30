package rekursion_iteration;

public class MainPalindrom {
	// Attribute
	int indexVorne = 0;
	int indexHinten = 0;
	char[] txt;
	boolean isPali = false;

	// Iteration
	public void iterativ(String txtString) {
		txt = txtString.toLowerCase().toCharArray();
		indexVorne = 0;
		indexHinten = (txt.length - 1);
		while (indexVorne < indexHinten) {
			isPali = checkIteration(indexVorne, indexHinten);
			if (!isPali) {
				System.out.println("Es ist kein Palindrom");
				break;
			}
		}
		if (isPali) {
			System.out.println("Es ist ein Palindrom");
		}
	}

	public boolean checkIteration(int vorne, int hinten) {
		if (txt[vorne] == txt[hinten]) {
			indexVorne += 1;
			indexHinten -= 1;
			return true;
		}
		return false;
	}

	// Rekursion
	public void rekursion(String txtString) {
		txt = txtString.toLowerCase().toCharArray();
		if(checkRekursion(0, txt.length - 1)) {
			System.out.println("Es ist ein Palindrom");
		} else {
			System.out.println("Es ist kein Palindrom");
		}
	}

	public boolean checkRekursion(int vorne, int hinten) {
		if (vorne < hinten) {
			if (txt[vorne] == txt[hinten]) {
				checkRekursion(vorne + 1, hinten - 1);
			} else {
				return false;
			}
		}
		return true;
	}

	// Main-Methode
	public static void main(String[] args) {
		MainPalindrom m = new MainPalindrom();
		m.iterativ("Tisch");
		m.iterativ("Aga");
		m.iterativ("Anna");
		m.rekursion("Lagerregal");
		m.rekursion("Aha");
		m.rekursion("Fisch");
	}
}
