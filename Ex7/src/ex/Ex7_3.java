package ex;

class Parent2 {
	int x = 10;
}

class Child2 extends Parent2{
	void methods() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}
}

public class Ex7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2 c = new Child2();
		c.methods();
	}

}
