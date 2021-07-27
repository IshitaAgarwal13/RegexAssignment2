/* Q.1: Write a program to read the numbers until -1 is encountered. Also count the negative, positives
and zeros entered by user? */


package javaPack;
import java.util.Scanner;

public class NumberCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc=new Scanner(System.in);
        int n,zero=0,pos=0,neg=0;
        do {

            System.out.println("Enter an Integer:");
            n=sc.nextInt();
            if(n>0)
            	pos++;
            else if(n==0)
            	zero++;
            else
            	neg++;
        	
        }while(n!=-1);
        System.out.println("Total positive numbers are: "+pos+
        		"\nTotal negative numbers are: "+neg+
        		"\nTotal Zeroes are: "+zero);                       
        
	}

}
