import java.io.Console;

public class Chess{
	public static void main(String[] args){
		String[] square1 = {
				"*************************************************************************",
				"*  ****  *        *        *        *        *        *        *        *",
				"* *    * *        *        *        *        *        *        *        *",
				"*  ****  *        *        *        *        *        *        *        *",
				"*    *** *        *        *        *        *        *        *        *",
				"*************************************************************************",
		};
		String[] square2 = {
				"*************************************************************************",
				"*        *  ****  *        *        *        *        *        *        *",
				"*        * *    * *        *        *        *        *        *        *",
				"*        *  ****  *        *        *        *        *        *        *",
				"*        *    *** *        *        *        *        *        *        *",
				"*************************************************************************",
		};
		String[] square3 = {
				"*************************************************************************",
				"*        *        *  ****  *        *        *        *        *        *",
				"*        *        * *    * *        *        *        *        *        *",
				"*        *        *  ****  *        *        *        *        *        *",
				"*        *        *    *** *        *        *        *        *        *",
				"*************************************************************************",
		};
		String[] square4 = {
				"*************************************************************************",
				"*        *        *        *  ****  *        *        *        *        *",
				"*        *        *        * *    * *        *        *        *        *",
				"*        *        *        *  ****  *        *        *        *        *",
				"*        *        *        *    *** *        *        *        *        *",
				"*************************************************************************",
		};
		String[] square5 = {
				"*************************************************************************",
				"*        *        *        *        *  ****  *        *        *        *",
				"*        *        *        *        * *    * *        *        *        *",
				"*        *        *        *        *  ****  *        *        *        *",
				"*        *        *        *        *    *** *        *        *        *",
				"*************************************************************************",
		};
		String[] square6 = {
				"*************************************************************************",
				"*        *        *        *        *        *  ****  *        *        *",
				"*        *        *        *        *        * *    * *        *        *",
				"*        *        *        *        *        *  ****  *        *        *",
				"*        *        *        *        *        *    *** *        *        *",
				"*************************************************************************",
		};
		String[] square7 = {
				"*************************************************************************",
				"*        *        *        *        *        *        *  ****  *        *",
				"*        *        *        *        *        *        * *    * *        *",
				"*        *        *        *        *        *        *  ****  *        *",
				"*        *        *        *        *        *        *    *** *        *",
				"*************************************************************************",
		};
		String[] square8 = {
				"*************************************************************************",
				"*        *        *        *        *        *        *        *  ****  *",
				"*        *        *        *        *        *        *        * *    * *",
				"*        *        *        *        *        *        *        *  ****  *",
				"*        *        *        *        *        *        *        *    *** *",
				"*************************************************************************",
		};
		System.out.println("Below are the 12 distinct solutions for the 8 Queen game!");
		System.out.println();
		System.out.println("There are 92 solutions but they are just rotations of the 12 below!");
		System.out.println();
		System.out.println();
		System.out.println("Solution 1:");
		for(int i=0;i<6;i++){
			System.out.println(square3[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square6[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square2[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square7[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square1[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square4[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square8[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square5[i]);
		}
		System.out.println();
		System.out.println();
		System.out.println("Solution 2:");
		for(int i=0;i<6;i++){
			System.out.println(square2[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square6[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square8[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square3[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square1[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square4[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square7[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square5[i]);
		}
		System.out.println();
		System.out.println();
		System.out.println("Solution 3:");
		for(int i=0;i<6;i++){
			System.out.println(square6[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square3[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square7[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square2[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square4[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square8[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square1[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square5[i]);
		}
		System.out.println();
		System.out.println();
		System.out.println("Solution 4:");
		for(int i=0;i<6;i++){
			System.out.println(square3[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square6[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square8[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square2[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square4[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square1[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square7[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square5[i]);
		}
		System.out.println();
		System.out.println();
		System.out.println("Solution 5:");
		for(int i=0;i<6;i++){
			System.out.println(square4[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square8[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square1[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square3[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square6[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square2[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square7[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square5[i]);
		}
		System.out.println();
		System.out.println();
		System.out.println("Solution 6:");
		for(int i=0;i<6;i++){
			System.out.println(square7[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square2[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square6[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square3[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square1[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square4[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square8[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square5[i]);
		}
		System.out.println();
		System.out.println();
		System.out.println("Solution 7:");
		for(int i=0;i<6;i++){
			System.out.println(square2[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square6[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square1[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square7[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square4[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square8[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square3[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square5[i]);
		}
		System.out.println();
		System.out.println();
		System.out.println("Solution 8:");
		for(int i=0;i<6;i++){
			System.out.println(square1[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square6[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square8[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square3[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square7[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square4[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square2[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square5[i]);
		}
		System.out.println();
		System.out.println();
		System.out.println("Solution 9:");
		for(int i=0;i<6;i++){
			System.out.println(square1[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square5[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square8[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square6[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square3[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square7[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square2[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square4[i]);
		}
		System.out.println();
		System.out.println();
		System.out.println("Solution 10:");
		for(int i=0;i<6;i++){
			System.out.println(square2[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square4[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square6[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square8[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square3[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square1[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square7[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square5[i]);
		}
		System.out.println();
		System.out.println();
		System.out.println("Solution 11:");
		for(int i=0;i<6;i++){
			System.out.println(square6[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square3[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square1[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square8[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square4[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square2[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square7[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square5[i]);
		}
		System.out.println();
		System.out.println();
		System.out.println("Solution 12:");
		for(int i=0;i<6;i++){
			System.out.println(square4[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square6[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square8[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square2[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square7[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square1[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square3[i]);
		}
		for(int i=0;i<6;i++){
			System.out.println(square5[i]);
		}
	}
}