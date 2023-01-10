package honda;

public class A {
private void one() {
System.out.println("Class one");
}
}
class B extends A{
	public void two() {
		System.out.println("Class two");
		}
}
	class C extends B{
		public void three() {
			System.out.println("Class three");
			}
	}	
		class D extends C{
			public void four() {
				System.out.println("Class four");
				}
			
			public static void main(String[] args) {
				D d = new D();
				d.three();
			}
		
}

