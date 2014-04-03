import java.util.*;
import java.lang.*;
import java.io.*;

class TicTacToe
{
	public int cntXR,cntXC,cntXDA,cntXDB;
	public int cntOR,cntOC,cntODA,cntODB;
	public int n = 4;
	public int tot = n*n;

	public int solution(char[][] arr){
		for(int i = 0;i < this.n;i++){
			this.cntXR = this.cntXC = this.cntOR = this.cntOC = 0;
			for(int j = 0;j < this.n;j++){
				if(arr[i][j] == 'X' || arr[i][j] == 'T'){
					this.cntXR++;
				}
				if(arr[i][j] == 'O' || arr[i][j] == 'T'){
					this.cntOR++;
				}
				if(arr[j][i] == 'X' || arr[j][i] == 'T'){
					this.cntXC++;
				}
				if(arr[j][i] == 'O' || arr[j][i] == 'T'){
					this.cntOC++;
				}
			}
			if(this.cntXR == this.n || this.cntXC == this.n || this.cntOR == this.n || this.cntOC == this.n){
				break;
			}
		}
		
		if(this.cntXR == this.n || this.cntXC == this.n){
			return 1;
		}else if(this.cntOR == this.n || this.cntOC == this.n){
			return 2;
		}
		
		this.cntXDA = this.cntXDB = this.cntODA = this.cntODB = 0;
		for(int p = 0,q = 3;p < this.n;p++,q--){
			if(arr[p][p] == 'X' || arr[p][p] == 'T'){
				this.cntXDA++;
			}
			if(arr[p][q] == 'X' || arr[p][q] == 'T'){
				this.cntXDB++;
			}
			if(arr[p][p] == 'O' || arr[p][p] == 'T'){
				this.cntODA++;
			}
			if(arr[p][q] == 'O' || arr[p][q] == 'T'){
				this.cntODB++;
			}
		}
		
		if(this.cntXDA == this.n || this.cntXDB == this.n){
			return 1;
		}else if(this.cntODA == this.n || this.cntODB == this.n){
			return 2;
		}
		
		int totCnt = 0;
		for(int x = 0;x < this.n;x++){
			for(int y = 0;y < this.n;y++){
				if(arr[x][y] == 'X' || arr[x][y] == 'T' || arr[x][y] == 'O'){
					totCnt++;
				}
			}
		}
		
		if(this.tot == totCnt){
			return 3;
		}else if(this.tot < 16){
			return 4;
		}
		
		return 0;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		Ideone obj = new Ideone();
		int ans = 0;

		int tastCase = sc.nextInt();
		sc.nextLine();
		for(int t = 1;t <= tastCase; t++){
			char[][]  arrA = new char[4][4];
			String op = new String("");
			op = "Case #"+t+": ";
			for(int i = 0;i < 4;i++){
				String str = sc.nextLine();
				for(int j = 0;j<str.length();j++){
					arrA[i][j] = str.charAt(j);
				}
			}
	
			ans = obj.solution(arrA);
			if(ans == 1){
				op += "X won";
			}else if(ans == 2){
				 op += "O won";
			}else if(ans == 3){
				op += "Draw";
			}else{
				op += "Game has not completed";
			}
			
			System.out.println(op);
			String str = sc.nextLine();
		}
	}
}
