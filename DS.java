package test;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;  
public class DS {
	
	
	public static boolean isStack(String[] input) {
	   boolean flag = false; 
	   int counter = 0  ;
	   //loop over the input set
		for(int i = 0 ; i < input.length ; i++){
   		if(input[i] == null) {
   			continue;
   		}
   		//check if is it input operation or output operation
		if(input[i].charAt(0)=='1') {
   			 counter++;//increase the counter and continue the loop if its input
   			 continue;
   		 }else if(input[i].charAt(0)=='2') {
   		    //if its output here we will compare the last element of input with the first element of output 
   			counter--;//
   			String element1 = input[i].substring(1);
   			String element2 = input[counter].substring(1);
   			
   			
   			
   			if(element1.equals(element2)){
   				flag=true;
   				
   			}else {
   				flag=false;
   				break;
   			}
   		 }else {
   			 flag= false;
   		 }
   		 }//for loop
		
		
		
		 return flag? true:false;
		
	}
	
	
	
	public static boolean isQueue(String[] input) {
		 boolean flag = false;
		   int counter = 0  ;
		   
			for(int i = 0 ; i < input.length ; i++){
	   		 if(input[i].charAt(0)=='1') {
	   			 continue;
	   		 }else if(input[i].charAt(0)=='2') {
	   			
	   			String element1 = input[i].substring(1);
	   			String element2 = input[counter].substring(1);
	   			
	   			counter++;
	   			
	   			
	   			if(element1.equals(element2)){
	   				flag=true;
	   				
	   			}else {
	   				flag=false;
	   				break;
	   			}
	   		 }else {
	   			 flag=false;
	   		 }
	   		 }//for loop
			
			
			
			 return flag? true:false;
	
	}
	
	
	
     public static void main (String[] args) throws IOException  {
    	     //array of valid bills
    	     String[] refrence = {"1","5","10","20","50","100"};
    	     
    		 Scanner sc=new Scanner(System.in);  
        	 System.out.print("Enter the number of Operations: ");  
        	 //reading the number of elements from the that we want to enter  
        	 int n= sc.nextInt(); 
        	 String[] operations = new String[n];
        	 System.out.println("Enter the operations: ");  
        	 for(int i=0; i<n; i++)  
        	 {  
        	     //reading array elements from the user
        		 
        		 int element = sc.nextInt(); 
        		 String elementstring = String.valueOf(element);
        		 
        		 
        		 //check weather input is valid or not 
        		 for(int j = 0 ; j < refrence.length ; j++) {
        			 String x = elementstring.substring(1);
        			 //check weather the element entered is valid or not 
        		    if( x.equals(refrence[j])) {
        		    	operations[i]= elementstring;
        		    	break;
        		 }else {
        			 continue;
        		 }
        		 }
        		 
        		
        		  }
        	 
        	 List<String> list = new ArrayList<String>();
    		 for(String s : operations) {
    		       if(s != null && s.length() > 0) {
    		          list.add(s);
    		       }
    		    }

    		    operations = list.toArray(new String[list.size()]);
        	 
        	      for(int k = 0 ; k < operations.length ; k++) {
        	    	  System.out.println(operations[k]);
        	      }
        	 
                  //Instantiating the File class
        	      File file = new File("C:\\Users\\HP\\eclipse-workspace\\test\\src\\test\\Result.txt");
        	      //Instantiating the PrintStream class
        	      PrintStream stream = new PrintStream(file);
        	      System.setOut(stream);
        	      //Printing values to file
        	      if(isStack(operations)) {
        	    	  System.out.println("S");
        	      }else if (isQueue(operations)) {
        	    	  System.out.println("q");
        	      }else if(isStack(operations) == false && isQueue(operations)==false) {
        	    	  System.out.println("!");
        	      }
        	      
    	}
    	
    	      
    	      
    	      
    	      
    	     
    	   
}
    	
    	 
    	
    	 
    	 
    	 
     

