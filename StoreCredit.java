import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StoreCredit {

	public static void main(String[] args) throws FileNotFoundException {
		File fname = new File("StoreCredit/A-small-practice.in");
		Scanner sc = new Scanner(fname);
		int tCase = sc.nextInt();
		for(int i = 0;i < tCase;i++){
			int cAmount = sc.nextInt();
			int items   = sc.nextInt();
			int[] arrPrice = new int[items];

			for(int p = 0;p < items;p++){
				arrPrice[p] = sc.nextInt();
			}
			
			int key1 = 0;
			int key2 = 0;
			for(int x = 0;x < items;x++){
				for(int y = 0;y < items;y++){
					if(((arrPrice[x]+arrPrice[y]) == cAmount) && x != y){
						if(x < y){
							key1 = x+1;
							key2 = y+1;
						}else{
							key1 = y+1;
							key2 = x+1;
							
						}
					}
				}
			}
			
			System.out.println("Case #"+(i+1)+": "+key1+" "+key2);
		}
		sc.close();
	}

}
