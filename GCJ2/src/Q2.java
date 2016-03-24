
// ** GCJ PROBLEM A- STORE CREDIT */
//import java.util.Scanner;
import java.io.*;
import java.util.*;
public class Q2 {
	 private static Scanner x;
	public static int readFile(String filename){
		try{
			x=new Scanner (new File(filename));
			return 1;
		}
		catch(Exception e) {
			System.out.println("Could not open the File");
			return 0;
			
		}
	}
	public static String buyTwo(double price, int numOfItems, double[] itemPrices) { 
		
	    for(int i=0;i<numOfItems;i++) {
	      for(int j=0;j<numOfItems;j++) {
	        if(i != j) { 
	          if(itemPrices[i] + itemPrices[j] == price) { 
	            return ((i + 1) + " " + (j + 1)); 
	          }  }  }   } 
	    return "";   }
	public static void main(String[] args){
	    String inputfile= "A-small-practice.in";
	    if (readFile(inputfile)==1){
	    while (x.hasNext()){
	    	int testCases=x.nextInt();
	    	for (int i=0; i< testCases; i++){
	    		System.out.print("Case#" + (i+1) +":");
	        double storeCredit= x.nextDouble();
	        int totalItem= x.nextInt();
	        double[] prices= new double[totalItem];
	        for ( int j=0; j<totalItem;j++){
				prices[j]= x.nextInt();
			}
	        System.out.println(buyTwo(storeCredit,totalItem, prices ));
	    	}    }   }		}	}
