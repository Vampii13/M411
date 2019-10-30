package greedy;

import java.util.Hashtable;

public class MainGreedy {
	static Hashtable<String, Double> ware = new Hashtable<String, Double>();
	static Hashtable<String, Double> liste = new Hashtable<String, Double>();
	double summe = 0;
	
	public void fill() {
		ware.put("Milch", 2.00);
		ware.put("Getränke",6.00);
		ware.put("Brot", 3.50);
		ware.put("Äpfel", 3.00);
		ware.put("Pizza", 7.50);
		ware.put("Gemüse", 4.00);
	}
	
	public void createList(Hashtable<String, Double> uebrig) {
		if(summe < 20) {
			createList(uebrig);
		}
	}
	
	public static void main(String[] args) {
		MainGreedy m = new MainGreedy();
		m.fill();
		m.createList(ware);
	}
}
