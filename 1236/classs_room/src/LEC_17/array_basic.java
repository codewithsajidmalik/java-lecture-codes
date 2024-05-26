package LEC_17;

public class array_basic {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		revarr(0,arr);
		
	}
	public static void pa(int[] arr) {
	 int e = arr.length-1;
	 int s = arr.length;

	 if(s==e) {
		 return;
	 }
	 System.out.println(s);
//	 pa(e);
	}
public static void revarr(int s,  int[] arr) {
	if(s==arr.length-1) {
		return;
	}
	revarr(s+1,arr);
	System.out.println(arr[s]);

}
public static void firoccur(int s, int[] arr) {
	firoccur(s+1,arr);
	int ali = s+1;
	if(ali==arr.length) {
		System.out.println(ali);
		
	}
	// firoccur(s,ali);
	
	
}

}
