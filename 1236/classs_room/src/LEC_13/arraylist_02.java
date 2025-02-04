package LEC_13;

import java.util.ArrayList;

public class arraylist_02 {
	public static void main(String[] args) {
		//int[] arr1 = 

	int[] arr1 = { 5, 7, 10, 10, 10, 20, 30, 30, 50, 60, 60, 80 };
	int[] arr2 = { 10, 10, 15, 20, 30, 30, 30, 60, 70, 80, 80, 90 };
        System.out.println(Intersection(arr1, arr2));

//		int[] arr1 = { 9, 8, 7, 5 };
//		int[] arr2 =    { 9, 6, 7 };
		//System.out.println(Add(arr1, arr2));

	}

	public static ArrayList<Integer> Add(int[] arr1, int[] arr2) {
		ArrayList<Integer> AL = new ArrayList<>();
		int idx1 = arr1.length - 1;
		int idx2 = arr2.length - 1;
		int carry = 0;
		while (idx1 >= 0 || idx2 >= 0) {
			int sum = carry;
			if (idx1 >= 0) {
				sum = sum + arr1[idx1];
			}
			if (idx2 >= 0) {
				sum = sum + arr2[idx2];
			}
			int digit = sum % 10;
			AL.add(digit);
			carry = sum / 10;
			idx1--;
			idx2--;

		}
		if(carry>0) {  // if carry is greater than the zero so carry add first than digit
			AL.add(carry);
		}
		return AL;
	}

	public static ArrayList<Integer> Intersection(int[] arr1, int[] arr2) {
		ArrayList<Integer> AL = new ArrayList<>();

		int idx1 = 0;
		int idx2 = 0;
		while (idx1 < arr1.length && idx2 < arr2.length) {
			if (arr1[idx1] == arr2[idx2]) {
				AL.add(arr1[idx1]);
				idx1++;
				idx2++;
			} else if (arr1[idx1] < arr2[idx2]) {
				idx1++;
			} else {
				idx2++;
			}
		}
		return AL;

	}
}
	


