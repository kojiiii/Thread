package thread;
//�X���b�h�̃T�u�N���X�𗘗p
public class Thread_run extends Thread{ //���Ƃ���Thread�Ƃ����֐��݂����̂͒�`����Ă���B
		
	public void run() {
		for (int i = 0;i < 10;i++) {
			
			System.out.println("�X���b�h����o�́F"+i);
			
			try {
				sleep(500);
			} catch (InterruptedException e) { //��O�������Ƃ��āA���ꂪ�N�����Ƃ��ɑΏ�����B
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}



