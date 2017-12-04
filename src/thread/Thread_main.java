package thread;

public class Thread_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Thread_run th [] = new Thread_run[5];
			//Thread_run th1 [] = new Thread_run[5];
			Thread_runnable th2 [] = new Thread_runnable[5];
			
			for(int i = 0; i < 2; i++) {
				th[i] = new Thread_run();
				th[i].start();
				th2[i] = new Thread_runnable();
			//th1.start();
				th2[i].run();
			//try {
				//th.join();
			//} catch (InterruptedException e) { //例外を書いといて、それが起きたときに対処する。
				// TODO Auto-generated catch block
				//e.printStackTrace();
			//}
			}
			for(int i = 0;i < 10; i++) {
				System.out.println("mainから出力："+i);
			}

	}

}
