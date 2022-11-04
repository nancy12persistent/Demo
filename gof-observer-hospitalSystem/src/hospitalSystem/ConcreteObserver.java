package hospitalSystem;

public class ConcreteObserver extends Observer{

	@Override
	public void update(Subject subject) {
		((ConcreteSubject) subject).processData();
		
	}

}
