package 과자클래스;

public class SnackMain {

	public static void main(String[] args) {

		// 실직적으로 MY 클래스를 통해서
		// 과자를 먹는 기능을 수행
		My m1 = new My();
		kkoKkalKon snack1 = new kkoKkalKon();
		homeRunBall snack2 = new homeRunBall();
		sunChip snack3 = new sunChip();
		

		// m1.KkokKalKonOpen(snack1); // 꼬깔콘 먹기
		// m1.HomeRunBallOpen(snack2); // 홈런볼 먹기
		// m1.SunChipOpen(snack3); // 썬칩 먹기
		m1.snackOpen(snack1);
		m1.snackOpen(snack2);
		m1.snackOpen(snack3);

	}

}
