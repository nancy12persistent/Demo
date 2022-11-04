package hospitalSystem;

public class TestClient {
	public static void main(String[] args) {
		System.out.println("Inside Main");
		ConcreteSubject sub=new ConcreteSubject();
		ConcreteObserver observer1=new ConcreteObserver();
		
		sub.attach(observer1);
		sub.changedData();
	}

}
