package ����Ŭ����;

public class SnackMain {

	public static void main(String[] args) {

		// ���������� MY Ŭ������ ���ؼ�
		// ���ڸ� �Դ� ����� ����
		My m1 = new My();
		kkoKkalKon snack1 = new kkoKkalKon();
		homeRunBall snack2 = new homeRunBall();
		sunChip snack3 = new sunChip();
		

		// m1.KkokKalKonOpen(snack1); // ������ �Ա�
		// m1.HomeRunBallOpen(snack2); // Ȩ���� �Ա�
		// m1.SunChipOpen(snack3); // ��Ĩ �Ա�
		m1.snackOpen(snack1);
		m1.snackOpen(snack2);
		m1.snackOpen(snack3);

	}

}
