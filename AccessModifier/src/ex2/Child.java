package ex2;

public class Child extends Parent {
	private int r = 300;
	
	public void dislpay() {
		System.out.println("x = " + getX());
		System.out.println("y = " + getY());
		System.out.println("r = " + this.r);
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
}
