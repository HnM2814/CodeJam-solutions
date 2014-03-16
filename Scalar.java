import java.io.File;
import java.io.FileNotFoundException;
//import java.util.Arrays;
//import java.util.Collections;
import java.util.Scanner;

public class Scalar {

	public static void main(String[] args) {
		File fName = new File("MinimumScalarProduct/A-large-practice.in");
		try {
			Scanner sc = new Scanner(fName);
			int tCase = sc.nextInt();
//			long start = System.currentTimeMillis();
			for(int i=0;i<tCase;i++){
				int vSpace = sc.nextInt();
				long[] arrA = new long[vSpace];
				long[] arrB = new long[vSpace];
				for(int j=0;j<vSpace;j++){
					arrA[j] = sc.nextInt();
				}
				
				for(int k=0;k<vSpace;k++){
					arrB[k] = sc.nextInt();
				}
								
				long swapA;
				for(int p = 0;p < (vSpace-1);p++){
					for(int q = 0;q < (vSpace-p-1);q++){
						if(arrA[q] > arrA[q+1]){
							swapA     = arrA[q];
							arrA[q]   = arrA[q+1];
							arrA[q+1] = swapA;
						}
					}
				}
				
				long swapB;
				for (int c = 0; c < ( vSpace - 1 ); c++) {
					for (int d = 0; d < vSpace - c - 1; d++) {
				        if (arrB[d] < arrB[d+1]){
				        	swapB     = arrB[d];
				        	arrB[d]   = arrB[d+1];
				        	arrB[d+1] = swapB;
				        }
					}
				}
								
			//	Arrays.sort(arrA);
			//	Arrays.sort(arrB,Collections.reverseOrder());
				
				long op = 0;
				for(int x=0;x<vSpace;x++){
					op = op+(arrA[x]*arrB[x]);
				}
				System.out.println("Case #"+(i+1)+": "+op);
			}
			sc.close();
	//		long end = System.currentTimeMillis();
	//		System.out.println("Time Taken : "+(end-start)+ "ms");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
