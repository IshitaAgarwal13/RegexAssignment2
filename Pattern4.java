/*  Q.5

$$$$$$$$$
$$$$ $$$$
$$$   $$$
$$     $$
$       $
$$     $$
$$$   $$$
$$$$ $$$$
$$$$$$$$$

*/

package javaPack;
import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of lines:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
        	for(int j=0;j<(2*n);j++) {
                //upper left triangle
        		if(i+j<=n-1)
        			System.out.print("$");
        		else
        			System.out.print(" ");
        		
        		//upper right triangle
        		if((i+n)<=j)
        			System.out.print("$");
        		else
        			System.out.print(" ");
        	}
        	System.out.println();
        }
        for(int i=0;i<n;i++) {
        	for(int j=0;j<(2*n);j++) {
                //bottom left triangle
        		if(i>=j)
        			System.out.print("$");
        		else
        			System.out.print(" ");
        		
        		//bottom right triangle
        		if(i>=(2*n-1)-j)
        			System.out.print("$");
        		else
        			System.out.print(" ");
        	}
        	System.out.println();
        }        
	}

}
