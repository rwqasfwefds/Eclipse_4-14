package OverRiding_Ex;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		VIP, Gold, Silver
//		�Ӽ� : �� ID
//			  �� �̸�
//			  �� ���
		
//		��� :  show() : ���ʿ� ������ ����� ���� ���θ� �Ϲ� ���Դϴ�.
//		VIP, Gold, Silver : ��ID, ���̸�, ����� ���
//		��ID : 1, 2, 3
//		���̸� : "ȫ�浿", "�̼���", "�귡��",
//		����� : "VIP", "Gold", "Silver",
		
//		���� ������ �����ϰ� ����� ����ϼ���
		VIP vip = new VIP();
		Gold gold = new Gold();
		Silver silver = new Silver();
		Normal normal = new Normal();
		
		vip.show(1, "ȫ�浿", "VIP");
		gold.show(2, "�̼���", "Gold");
		silver.show(3, "�귡��", "Silver");
		normal.show();
	}

}
