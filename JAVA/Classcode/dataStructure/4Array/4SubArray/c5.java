
/*
 given an array we have print all the posible subarray sum for the give array

 arr = {2,4,1,3}s

 */
//TC:O(N^3)
class printSubarray{

	public static void main(String[] boss){
	
		int arr[] = new int[]{2,4,1,3};
		int N= arr.length;
		
		for(int i = 0;i<N;i++){

			for(int j =i;j<N;j++){
			
				int sum=0;
				for(int k= i;k<=j;k++){
				
					sum = sum + arr[k];
				}
				System.out.println(sum);
			
			}
		
		}
	
	}

}
