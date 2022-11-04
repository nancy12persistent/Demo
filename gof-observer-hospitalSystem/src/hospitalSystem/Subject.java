package hospitalSystem;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	private List<Observer> observers=new ArrayList<>();
	
	public void attach(Observer ob) {
		observers.add(ob);		
	}
	
	public void dettach(Observer ob) {
		observers.remove(ob);		
	}
	
	public void notifyObservers() {
		for(Observer o:observers)	{
			o.update(this);
		}
	}
	

}
