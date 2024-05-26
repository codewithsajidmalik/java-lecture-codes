package lec_06;

public class patrren_25 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int totl_sp = n - 1;
		int totl_st = 1;
		int num = 1;
		
		
		while(row<=n) {
		
			int cnt_sp = 0;
			while(cnt_sp< totl_sp) {
				System.out.print("\t");
				cnt_sp++;
			}
			int cnt_st = 0;
			while(cnt_st < totl_st) {
				System.out.print(num + "\t");
				num++;
				cnt_st++;
				
			}
			System.out.println();
			totl_sp--;
			totl_st = totl_st+2;
			row++;
		}
	}

}
