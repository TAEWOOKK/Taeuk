package polymorphism;

public class TvUser {

	public static void main(String[] args) {
		//SamsungTV class ����Ͽ� ����
		//TV tv = new SamsungTV();
		// LgTV ��ü�� ����
		TV tv = new LgTV();
		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();

	}

}
