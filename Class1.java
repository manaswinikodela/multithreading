package multiThreading;

public class Class1 extends Thread{ 
	int i;
	public void run(){  
		for(i=0;i<=3;i++)
		System.out.println("thread is running...");  
		}  
		public static void main(String args[]){  
		Class1 t1=new Class1();  
		t1.start();  
		 }  
		}  


