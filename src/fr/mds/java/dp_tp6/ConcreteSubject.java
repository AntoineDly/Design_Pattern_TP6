package fr.mds.java.dp_tp6;

public class ConcreteSubject extends Subject {
	
	private int state = 0;
	public int statechange;
	
	public ConcreteSubject (int stateChange) {
		this.statechange = stateChange;
	}
	
	public void execute() {
		this.state ++;
		System.out.println(state + "state change: " + statechange);
		for(Observer observer : observers) {
			observer.update(statechange);
		}
	}
}
