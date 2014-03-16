import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReverseWords {
	public static void main(String[] args) throws FileNotFoundException {
		File fname = new File("ReverseWords/B-large-practice.in");
		Scanner sc = new Scanner(fname);
		int tCase  = sc.nextInt();
		sc.nextLine();
		for(int i = 0;i < tCase;i++){
			String str = sc.nextLine();
			String[] strArr;
			strArr = str.split(" ");
		/*	for(int j=0;j<strArr.length;j++){
				System.out.println(strArr[j]);
			}*/
			String op = "";
			for(int x = (strArr.length-1);x >= 0;x--){
				op += strArr[x];
				if(x != 0){
					op += " ";
				}
			}
			
			System.out.println("Case #"+(i+1)+": "+op);
		}
		sc.close();		
	}

}
