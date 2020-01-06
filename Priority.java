package multiThreading;
class X extends Thread
{
   public void run()
   {
     System.out.println("Thread x Started");
     for(int i=0; i<5; i++)
        {
              System.out.println("\t value of i in Thread x : " + i);
        }
              System.out.println("Threadx finished ");
    }
}
class Y extends Thread
{
	   public void run()
	   {
	     System.out.println("Thread Y Started");
	     for(int i=0; i<5; i++)
	        {
	              System.out.println("\t value of i in Thread y : " + i);
	        }
	              System.out.println("Thready finished ");
	    }
	}
class Z extends Thread
{
		   public void run()
		   {
		     System.out.println("Thread z Started");
		     for(int i=0; i<5; i++)
		        {
		              System.out.println("\t value of i in Thread z : " + i);
		        }
		              System.out.println("Threadz finished ");
		    }
		}


public class Priority 
{  
	   public static void main(String[] args)
	      {
	              System.out.println("Main thread started");
	              X threadX = new X();
	              Y threadY = new Y ();
	              Z threadZ = new Z ();
	   
	              threadZ.setPriority(Thread.MAX_PRIORITY); 
	              threadY.setPriority(threadX.getPriority());
	              threadX.setPriority(Thread.MIN_PRIORITY); 
	              threadX.start(); threadY.start(); threadZ.start();
	      
	      }
	   }