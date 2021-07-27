/*  Q.4

1
232
34543
4567654
567898765
*/

package javaPack;
import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of lines:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
        	for(int j=i;j<=2*i-1;j++) {
        			System.out.print(j);
        		
        	}
        	for(int k=2*i-2;k>=i;k--) {
        		System.out.print(k);
        	}
        	System.out.println();
        }
        
	}

}

