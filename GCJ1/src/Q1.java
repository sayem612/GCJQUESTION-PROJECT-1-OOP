//* GCJ PROBLEM B_ REVERSE WORD*/
import java.util.*;
import java.io.*;
import java.util.Scanner;
public class Q1 {
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
        public static String ReverseWord (String in){
        	String out[] = in.split(" ");
            String reverse="";
        	for (int i = out.length - 1; i >= 0; i--) {
    			reverse+=(out[i]+" ");
    		}
        	return reverse;
        }

		public static void main(String args[]) {
		String inputFile= "B-large-practice.in";
		if(readFile(inputFile)==1){
		int lines=x.nextInt();
		String sentence=x.nextLine();
		for (int i=0; i<lines; i++){
			System.out.print("Case#"+(i+1)+":");
			sentence=x.nextLine();
			String backward=ReverseWord(sentence);
			System.out.println(backward);
			//sentence="";
		}
		}
		}}
