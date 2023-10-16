
/*
 given an array we have print all the posible subarray sum for the give array

 arr = {2,4,1,3}s

 */
//optimize apparoch
//TC:O(N^2)
class printSubarray{

	public static void main(String[] boss){
	
		int arr[] = new int[]{2,4,1,3};
		int N= arr.length;
		int prefixSum[] = new int[N];
		int sum = 0;
		for (int i= 0;i<N;i++){
		
			sum = sum +arr[i];
			prefixSum[i]=sum;
		}

		//int sum1=0;
		for(int i =0;i<N;i++){
		
			int sum1=0;

			for(int j=i;j<N;j++){
			
				if(i==0){
				
					System.out.println(arr[i]);
				}

				else{
				
					sum1 = prefixSum[j] - prefixSum[i-1];
				}

				System.out.println(sum1);
			
			}

			//System.out.println();
						
		}`
		
		
	
	}

}
