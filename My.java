package ����Ŭ����;

public class My {

	// ������ �Դ� ���

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
		//snack �̶�� ��ü �ϳ��� ���� �ٸ� ����� �Ҽ� �ְԲ� ������
		// ----> ������
		
		snack.open();
		// ��ĳ���� �Ȼ��¿��� �Ͻ������� ����Ŭ������ �ִ�
		// ����� �����ϰ� ������-> �ٿ�ĳ����
		// ����Ŭ������ �ٿ�ĳ���� ��ü��= (����Ŭ������) ��ĳ���õȰ�ü��
		if (snack instanceof sunChip) {
			// A instanceof B ->
			// A ��� ��ü�� B�κ��� ��ĳ���õ� ��ü��� ->true ��ȯ
			// �ƴ϶�� false ��ȯ
			// snack �̶�� ������ ��Ĩ���κ���
			// ��ĳ���õ� �������
			// �ٿ�ĳ����
			sunChip ssunChiip = (sunChip) snack;
			ssunChiip.sorce();
		}

	}

}
