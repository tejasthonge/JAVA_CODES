/*
 
   Find out of subarray of in the given arr 
Arr:{4,2,10,3,12,-2,15}
*/

/*
 //TC : O(N)
class subArray{

	public static void main(String[] boss){
	
		int count =0;
		int arr[] = new int[]{4,2,10,3,12,-2,15};
	
		int N= arr.length;
		for(int i= 0;i<N;i++){
		
			for(int j= i;j<N;j++){
				
				count++;		
			
			}
		}
		System.out.println(count);
	}

}

*/

//TC :O(1)
class subArray{

	public static void main(String[] boss){
	
		int arr[] = new int[]{4,2,10,3,12,-2,15};
		int N= arr.length;

		int noOfSub = N *(N+1)/2;

		System.out.println(noOfSub);
	
	}

}
