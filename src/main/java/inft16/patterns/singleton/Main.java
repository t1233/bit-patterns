package inft16.patterns.singleton;

public class Main {

	public static void main(String args[]) {
		KeyBoard keyBoard1 = new KeyBoard();
		System.out.println("KeyBoard 1 ID: " + keyBoard1.hashCode());
		
		KeyBoard keyBoard2 = new KeyBoard();
		System.out.println("KeyBoard 2 ID: " + keyBoard2.hashCode());
	}
	
}
