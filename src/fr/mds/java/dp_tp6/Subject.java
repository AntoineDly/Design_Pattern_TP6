package fr.mds.java.dp_tp6;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

  protected final List<Observer> observers = new ArrayList<Observer>();
  
  public void attach(Observer observer) {
    if (!observers.contains(observer)) {
      this.observers.add(observer);
    }
  }

  public void detach(Observer observer) {
    if (observers.contains(observer)) {
      this.observers.remove(observer);
    }
  }

}
