package mathodOverride;

public  class Web {
	  
	     public Web(int a) {
	    	
	    
	    	 System.out.println("int parameter constractor");
	    	 
	     }
	     public Web(String a) {
	    	 System.out.println("String parameter constractor");
	     }
	     
	     public static void main(String[] args) {
			
	    	 new Web(35);
	    	 
		}
	      
}
