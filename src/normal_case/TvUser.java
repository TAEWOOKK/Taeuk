package normal_case;

public class TvUser {

	public static void main(String[] args) {
		// SamsungTV Ŭ������ ����Ͽ� ����
		
//		SamsungTV tv = new SamsungTV();
//		
//		tv.powerOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();
		//LGTv Ŭ������ ����Ͽ� ����
		//TV��ü�� SamsungTv ���� LGTV�� �ٲܰ��
		//��ü ������ �޼ҵ� ȣ�� ��� ���α׷��Ӱ� �����ؾ���.
		LgTV tv = new LgTV();
		
		tv.turnOn();
		tv.soundUp();
		tv.soundDown();
		tv.turnOff();
		
		
	}

}
