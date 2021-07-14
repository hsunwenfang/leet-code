// package HashSetApp;
import java.util.HashSet;

public class singleNumberChecker {
	public int singleNumber(int[] nums){
		HashSet hashSet = new HashSet<>();
		for (int i:nums){
			if (!hashSet.add(i)){
				hashSet.remove(i);
			}
		}
		int result = (Integer)hashSet.iterator().next();
		return result;
	}
	public static void main(String args[]){
		singleNumberChecker checker = new singleNumberChecker();
		int[] nums = {1, 6, 1, 2, 2, 5, 6, 8, 8};
		int n = checker.singleNumber(nums);
		System.out.println(n);
	}
	
}

