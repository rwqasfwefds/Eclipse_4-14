package ex2;

public class ColorPoint extends point{
	public String color;
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.print(color);
		showPonint();
	}
}
