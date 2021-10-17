package Threads;

public class ThreadSample extends Thread{
	public void run()
 	{
  		System.out.println("concurrent thread started running..");
}
 	public static void main( String args[] )
 	{
 		ThreadSample mt = new  ThreadSample();
  		mt.start();
 	}


}
