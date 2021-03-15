package fr.mds.java.dp_tp6;

public class OctalObserver implements Observer {

	public void update(int number) {
		System.out.println("Octal String: " +  Integer.toOctalString(number) );
	}
	
}
