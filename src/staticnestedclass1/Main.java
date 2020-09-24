//--------------------------------------------------------------------- Static Nested Class
package staticnestedclass1;

class MotherBoard {

	   // static nested class
	   static class USB{
	       int usb2 = 2;
	       int usb3 = 1;
	       int getTotalPorts(){
	           return usb2 + usb3;
	       }
	   }

	}
	public class Main {
	   public static void main(String[] args) {

	       // create an object of the static nested class
	       // using the name of the outer class
	       MotherBoard.USB usb = new MotherBoard.USB();
	       System.out.println("Total Ports = " + usb.getTotalPorts());
	   }
	}

	
/*
Unlike inner class, a static nested class cannot access the member variables of the outer class. 
It is because the static nested class doesn't require you to create an instance of the outer class.*/

//	OuterClass.NestedClass obj = new OuterClass.NestedClass();

/*Here, we are creating an object of the static nested class by simply using the class name of the outer class. Hence, the outer class cannot be referenced using OuterClass.this.*/
