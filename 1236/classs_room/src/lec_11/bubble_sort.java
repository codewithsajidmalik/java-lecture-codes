package lec_11;

public class bubble_sort {
	public static void main(String[] args) {
		int[] arr = { 50, 40, 20, 100, 250, 90 };
//		int[] arr = { 10, 20, 30, 40, -3 };
		print(arr);
		bubble(arr);
//		Selection(arr);
	//	Insertion(arr);
		print(arr);

	}
	
		public static void print(int[] arr) {
			for (int ali : arr) {
				System.out.print(ali + " ");
			}
			System.out.println();
		}

		public static void bubble(int[] arr) {
			for (int cnt = 1; cnt < arr.length; cnt++) {
				for (int s = 0; s <= arr.length - 1-cnt; s++) {
					// cnt ki jarurat kyu iski wajah se loop kam element par chal rha h 
//				arr[s] , arr[s+1];
					if (arr[s] > arr[s + 1]) {
						int temp = arr[s];
						arr[s] = arr[s + 1];
						arr[s + 1] = temp;
					}
				}
				print(arr);

			}
		}
	}



