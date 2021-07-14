
import java.util.HashMap;

public class DuplicateChecker {
	public boolean containDuplicate(int[] nums){
		HashMap hashMap = new HashMap<Integer, Integer>();
		for(int i =0; i<nums.length; i++){
			System.out.println(nums[i]);
			if (hashMap.containsValue(nums[i])){
				return true;
			}
			hashMap.put(i, nums[i]);
		}
		return false;
	}
	public static void main(String args[]){
		DuplicateChecker duplicateChecker = new DuplicateChecker();
		// int nums[] = {2, 3, 4, 5, 6, 2};
		int nums[] = {2, 3, 4, 4, 5, 6};
		boolean answer = duplicateChecker.containDuplicate(nums);
		System.out.println(answer);
	}
}
