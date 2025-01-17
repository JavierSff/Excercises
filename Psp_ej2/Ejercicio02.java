package Psp_ej2;

public class Ejercicio02 {

	static class Runners implements Runnable {
		private String runnerName;
		private int recordTime;
	
	public Runners (String runnerName, int recordTime) {
		this.runnerName = runnerName;
		this.recordTime = recordTime;
	}
	@Override
	public void run() {
		
		System.out.println(runnerName + "started running.");
		try {
			Thread.sleep(recordTime*1000L);
		}catch (InterruptedException e){
			
			System.out.println(runnerName + "was interrupted while runnig.");
			
		}
		System.out.println(runnerName + "arrived to the finish line.");
	}
}
	public class MultiThreadRunners {

	        public static void main(String[] args) {
	        
	    Runners runner1 = new Runners("Luis M.", 3);
	    Runners runner2 = new Runners("Mario S.", 3); 
	    Runners runner3 = new Runners("Ester L.", 3); 
	    
	    Thread thread1 = new Thread(runner1);
	    Thread thread2 = new Thread(runner2);
	    Thread thread3 = new Thread(runner3);
	    
	    thread1.start();
	    thread2.start();
	    thread3.start();
		
	    System.out.println("All Runners are running...");
	}
}
}
