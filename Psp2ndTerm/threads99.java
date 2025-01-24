    package Psp2ndTerm;

    public class threads99 {

	
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
	
	public static void main(String[] args) {
		        
		    Runners runner1 = new Runners("Luis M.", 3);
		 
		    for (int i = 0; i < 99; i++) {
	            Thread thread = new Thread(runner1); 
	            thread.start(); 
	            System.out.println("Runner " + runner1 + " is running...");
		    }
		}
    }
	
