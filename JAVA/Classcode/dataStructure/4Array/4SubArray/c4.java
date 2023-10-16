
/*
 given an array we have print all the posible subarray for the give array

 arr = {2,4,1,3}

 */

class printSubarray{

	public static void main(String[] boss){
	
		int arr[] = new int[]{2,4,1,3};
		int N= arr.length;
		
		for(int i = 0;i<N;i++){

			for(int j =i;j<N;j++){
			
				for(int k= i;k<=j;k++){
				
					System.out.print(arr[k] +" ");
				}
				System.out.println();
			
			}
		
		}
	
	}

}
