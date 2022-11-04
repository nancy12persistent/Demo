package hospitalSystem;

public class ConcreteObserver extends Observer{

	@Override
	public void update(Subject subject) {
		((ConcreteSubject) subject).processData();
		System.out.println("Thissss isss secondd");
		System.out.println("Thissss isss third");
		System.out.println("Thissss isss fourth");
	}

}
