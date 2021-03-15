package fr.mds.java.dp_tp6;

public class BinaryObserver implements Observer {

	public void update(int number) {
		System.out.println("Binary String: " +  Integer.toBinaryString(number) );
	}
	
}
