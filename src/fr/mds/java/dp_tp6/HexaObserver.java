package fr.mds.java.dp_tp6;

public class HexaObserver implements Observer {

	public void update(int number) {
		System.out.println("Hex String: " +  Integer.toHexString(number).toUpperCase());
	}
	
}
