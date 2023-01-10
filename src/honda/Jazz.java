package honda;

public class Jazz {
public void city() {
System.out.println("xyz");
}
}

class Tata extends Jazz{
	public void altroz() {
	System.out.println("abc");
	}
	

	public static void main(String[] args) {
		Tata t = new Tata();
  t.city();	
  t.altroz();
	}
}
