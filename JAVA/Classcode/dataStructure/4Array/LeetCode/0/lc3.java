/*
 3 . Search Insert Position (LeetCode-35)Given a sorted array of distinct integers and a target value, return the index
if the target is found. If not, return the index where it would be if it were
inserted in order.
You must write an algorithm with O(log n) runtime complexity.
Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4
Constraints:
1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums contains distinct values sorted in ascending order.
-104 <= target <= 104
   */


class Serarch{


	public static void main(String[]  boss){
	
		int arr[] = new int[]{1,3,5,6};
		
		int n= 2;
		int N=arr.length;

		for(int i=0;i<N;i++){
			int j=1;
			if(arr[i]==n){
			System.out.println(i);
			break;
			}
			else{
			if(n==j){
			System.out.println(i+1);
			}
			j++;
			}
			
			}
		}
	
	}


