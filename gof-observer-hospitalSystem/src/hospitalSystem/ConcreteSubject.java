package hospitalSystem;

public class ConcreteSubject extends Subject {
	public int processData() {
		System.out.println("Processing Data");
		return 10;
				
	}
	
	public void publishedData() {
		System.out.println("Publishing Data");
	}
	
	public void changedData() {
		notifyObservers();
	}

}
