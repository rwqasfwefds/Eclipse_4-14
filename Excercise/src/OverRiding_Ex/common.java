package OverRiding_Ex;

public class common {
	int id;
	String name;
	String grade;
	
	public void show(int id, String name, String grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		System.out.println("ID : " + id + ", " + "�̸� : " + name + ", " + "��� : " + grade);
	}
}
