package com.assignment.question3;

class A{
	public void method1(B b) {
	synchronized (String.class) {
		System.out.println("Acquired lock on String class object");
	}
	synchronized (Integer.class) {
		System.out.println("Acquired lock on Integer class object");
	}
}
}

class B{
	public void method2(A a) {
	
	synchronized (Integer.class) {
		System.out.println("Acquired lock on Integer class object");
	}
	synchronized (String.class) {
		System.out.println("Acquired lock on String class object");
	}
}
}	

public class DeadlockExample implements Runnable{
	
	A a = new A();
	B b = new B();
	
	// Constructor
	  DeadlockExample()
	  {
	    Thread t = new Thread(this); 
	    t.start();
	    a.method1(b);
	  }

	  public void run()
	  {
	    b.method2(a);
	  }
	  
	public static void main(String[] args) {
		new DeadlockExample();
	}
}
