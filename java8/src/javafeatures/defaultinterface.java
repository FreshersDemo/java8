package javafeatures;
	interface MyInterface{  
	    default void newMethod(){  
	        System.out.println("Enter your statement here");  
	    }  
	    
	    void existingMethod(String str);  
	}  
	public class defaultinterface implements MyInterface{ 
	    public void existingMethod(String str){           
	        System.out.println(str);  
	    }  
	    public static void main(String[] args) {  
	    	defaultinterface obj = new defaultinterface();
	         obj.newMethod();     
	        obj.existingMethod("welcome!!"); 
	  
	    }  
	}

