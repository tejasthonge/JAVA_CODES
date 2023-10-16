

/*
 
   given array of size and we we have to find the total no subaayr posible made by the array
	arr[] = {3,5,7};
	op:6
   */

class subArray{

	public static void main(String[] boss){
	
		int arr[] = new int[]{3,5,7};
		int N =arr.length;
		int count =0;
		for(int i= 0;i<N;i++){
			
			for(int j = i;j<N;j++){
				count++;	
	
			}
					
		}
		 System.out.println(count);
	
	
	}

}
