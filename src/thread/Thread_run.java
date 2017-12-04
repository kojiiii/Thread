package thread;
//スレッドのサブクラスを利用
public class Thread_run extends Thread{ //もともとThreadという関数みたいのは定義されている。
		
	public void run() {
		for (int i = 0;i < 10;i++) {
			
			System.out.println("スレッドから出力："+i);
			
			try {
				sleep(500);
			} catch (InterruptedException e) { //例外を書いといて、それが起きたときに対処する。
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}



