import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class T9Spelling {
	
	private static final TreeMap<Character,String> myMap;
	
	static{
		myMap = new TreeMap<Character,String>(); 
		myMap.put('a',"2");
		myMap.put('b',"22");
		myMap.put('c',"222");
		myMap.put('d',"3");
		myMap.put('e',"33");
		myMap.put('f',"333");
		myMap.put('g',"4");
		myMap.put('h',"44");
		myMap.put('i',"444");
		myMap.put('j',"5");
		myMap.put('k',"55");
		myMap.put('l',"555");
		myMap.put('m',"6");
		myMap.put('n',"66");
		myMap.put('o',"666");
		myMap.put('p',"7");
		myMap.put('q',"77");
		myMap.put('r',"777");
		myMap.put('s',"7777");
		myMap.put('t',"8");
		myMap.put('u',"88");
		myMap.put('v',"888");
		myMap.put('w',"9");
		myMap.put('x',"99");
		myMap.put('y',"999");
		myMap.put('z',"9999");
		myMap.put(' ',"0");
	}

	public static void main(String[] args) throws FileNotFoundException {
		File fname = new File("C-large-practice.in");
		Scanner sc = new Scanner(fname);
		int tCase  = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0;i < tCase;i++){
			String str = sc.nextLine();
			String op  = new String();
			for(int j = 0;j < str.length();j++){
				char ch = str.charAt(j);	
				String code = myMap.get(ch);
				int n = op.length();
				if(n > 0 && code.charAt(0) == op.charAt(n-1)){
					op += " ";
				}
				op += code;
			}
			System.out.println("Case #"+(i+1)+": "+op);
		}
		sc.close();
	}

}
