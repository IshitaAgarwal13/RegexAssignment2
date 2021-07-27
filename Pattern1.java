/*  Q.2

0
10
101
0101
01010
*/

package javaPack;
import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of lines:");
        int n=sc.nextInt();
        int flag=0;
        for(int i=0;i<n;i++) {
        	for(int j=0;j<=i;j++) {
        		System.out.print(flag);
        		flag=1-flag;
        	}
        	System.out.println();
        }
        
	}

}
