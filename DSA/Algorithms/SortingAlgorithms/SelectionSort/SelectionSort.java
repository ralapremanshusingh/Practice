public class SelectionSort {

	public static void selection(int[] nums) {

		for(int i =0 ; i<nums.length-1; i++) {

			for(int j=i+1; j<nums.length; j++) {
				if(nums[i]>nums[j]) {
					int temp = nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
	}


	public static void main(String []args) {
		int[] arr = {2,84,41,0,42,-2,7};

		selection(arr);
		
		for(int i : arr) {
			System.out.print(i + " ");
		}

		System.out.println();
	}
}