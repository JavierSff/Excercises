package Psp2ndTerm;

public class Ejercicio01 {

    static class Writer extends Thread {
        private String authorName;
        private int estimatedTime; 

     
        public Writer(String authorName, int estimatedTime) {
            this.authorName = authorName;
            this.estimatedTime = estimatedTime;
        }

        @Override
        public void run() {
            System.out.println(authorName + " started writing.");
            try {
       
                Thread.sleep(estimatedTime * 1000L); 
            } catch (InterruptedException e) {
                System.out.println(authorName + " was interrupted while writing.");
            }
            System.out.println(authorName + " finished writing.");
        }
    }

    public static class MultiThreadWriter {
        public static void main(String[] args) {
         
            Writer writer1 = new Writer("Louis the Journalist", 3);
            Writer writer2 = new Writer("Thomas the Writer", 5);
            Writer writer3 = new Writer("Nadia the Intern", 10);

         
            writer1.start();
            writer2.start();
            writer3.start();

       
            System.out.println("All writers are writing...");
        }
    }
}
