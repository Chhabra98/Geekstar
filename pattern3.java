/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=n-1;i>=0;i--){
		    for(int j=0;j<=i;j++){
		        System.out.print("*  ");
		    }
		    System.out.println();
		}
	}
}
