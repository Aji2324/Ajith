package org.sample;

public class ThisAndSuper extends Constructor {

	public ThisAndSuper(String name){
	 
		System.out.println("name is:");
	}
	public ThisAndSuper() {
		this("reyehy");
		System.out.println("default");
		System.out.println("old");
		System.out.println("new");
	}
		public static void main(String[] args) {
ThisAndSuper g=new ThisAndSuper();			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

