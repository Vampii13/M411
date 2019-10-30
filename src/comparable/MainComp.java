package comparable;

import java.util.ArrayList;

public class MainComp {
	ArrayList<Buch> list = new ArrayList<Buch>();
	
	public MainComp() {
		list.add(new Buch("Einhörnerbande", "Alex", 22, 2019));
		list.add(new Buch("Buch der Sprachen", "Athi", 22, 2017));
		list.add(new Buch("Einhörnerbande 2", "Alex", 22, 2020));
		
	}
	
	public void test() {
		for(int i = 0; i < list.size() -1; i++) {
			if(list.get(i).compareTo(list.get(i+1)) == 1) {
				Buch temp = list.get(i);
				list.set(i, list.get(i+1));
				list.set(i+1, temp);
			}
			System.out.println(list.get(i).compareTo(list.get(i+1)));
		}
		System.out.println(list.toString());
	}
	
	public static void main(String[] args) {
		MainComp m = new MainComp();
		m.test();
	}
}
