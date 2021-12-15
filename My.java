package 과자클래스;

public class My {

	// 꼬깔콘 먹는 기능

//	public void KkokKalKonOpen(kkoKkalKon snack) {
//		snack.open();
//	}

//	public void homeRunBall(homeRunBall snack) {
//		snack.open();
//	}

//	public void sunChip(sunChip snack) {
//		snack.open();
//	}

	public void snackOpen(Snack snack) {
		//snack 이라는 객체 하나로 서로 다른 기능을 할수 있게끔 도와줌
		// ----> 다형성
		
		snack.open();
		// 업캐스팀 된상태에서 일시적으로 하위클래스의 있는
		// 기능을 수행하고 싶을때-> 다운캐스팅
		// 하위클래스명 다운캐스팅 객체명= (하위클래스명) 업캐스팅된객체명
		if (snack instanceof sunChip) {
			// A instanceof B ->
			// A 라는 객체가 B로부터 업캐스팅된 객체라면 ->true 반환
			// 아니라면 false 반환
			// snack 이라는 변수가 썬칩으로부터
			// 업캐스팅된 변수라면
			// 다운캐스팅
			sunChip ssunChiip = (sunChip) snack;
			ssunChiip.sorce();
		}

	}

}
