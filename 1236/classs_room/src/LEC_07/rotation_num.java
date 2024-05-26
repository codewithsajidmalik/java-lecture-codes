package LEC_07;

public class rotation_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12345;  
		int rot = 33;
		int backup = n;
		int nod = 0;
		while(n>0) {
		n = n/10;
		nod++;
	
	}
		rot = rot%nod;
		n =backup;
		for(int r =1; r<=rot; r++) {
			int digit = n%10;
			int rem = n/10;
			int mult = (int) Math.pow(10, nod-1);
		n = digit *mult+rem;
		System.out.println(n);
			
		}
	}
	}


