package ex2;

public class ColorPointTest {

	public static void main(String[] args) {
//		point �ν��Ͻ�(��ü) ����
		point p = new point();
		
//		��ǥ ����
		p.set(1, 2);
		p.showPonint(); // ��ǥ ���
		
//		ColorPoint �ν��Ͻ�(��ü) ����
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4);
		cp.setColor("red");
		cp.showColorPoint(); // ��ǥ�� �������� ���
	}

}
