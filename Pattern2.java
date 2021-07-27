/*  Q.3

55555
54444
54333
54322
54321
*/


package javaPack;
import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of lines:");
        int n=sc.nextInt();
        for(int i=n;i>0;i--) {
        	for(int j=n;j>0;j--) {
        		if(j<=i)
        			System.out.print(i);
        		else
        			System.out.print(j);
        	}
        	System.out.println();
        }
        
	}

}
