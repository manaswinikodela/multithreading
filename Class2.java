package multiThreading;

public class Class2 implements Runnable{  
	public void run(){  
		System.out.println("thread is running...");  
		}  
		  
		public static void main(String args[]){  
		Class2 m1=new Class2();  
		Thread t1 =new Thread(m1);  
		t1.start();  
		 }  
		}  


