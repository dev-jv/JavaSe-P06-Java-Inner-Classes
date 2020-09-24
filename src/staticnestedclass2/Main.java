//--------------------------------------------------------------------- Accessing members of Outer class inside Static Inner Class
//package staticnestedclass2;
//
//class MotherBoard {
//	   String model;
//	   public MotherBoard(String model) {
//	       this.model = model;
//	   }
//
//	   // static nested class
//	   static class USB{
//	       int usb2 = 2;
//	       int usb3 = 1;
//	       int getTotalPorts(){
//	           // accessing the variable model of the outer classs
//	           if(MotherBoard.this.model.equals("MSI")) {
//	               return 4;
//	           }
//	           else {
//	               return usb2 + usb3;
//	           }
//	       }
//	   }
//	}
//	public class Main {
//	   public static void main(String[] args) {
//
//	       // create an object of the static nested class
//	       MotherBoard.USB usb = new MotherBoard.USB();
//	       System.out.println("Total Ports = " + usb.getTotalPorts());
//	   }
//	}
	
/*
	
When we try to run the program, we will get an error:

	error: non-static variable this cannot be referenced from a static context

This is because we are not using the object of the outer class to create an object of the inner class. Hence, there is no reference to the outer class Motherboard stored in Motherboard.this.
	
*/
	