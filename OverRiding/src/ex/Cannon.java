package ex;

public class Cannon extends Weapon{
//	오버라이딩 대상 위에 오버라이딩 되었다 라는 표시로 @Override를 적어줌
//	언어 테이션? 이라고 함
	@Override
	public int fire() {
		return 10; // 대포는 한 번에 10명 죽임
	}
}
