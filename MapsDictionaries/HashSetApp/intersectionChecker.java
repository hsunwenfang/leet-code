// package HashSetApp;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Arrays;

public class intersectionChecker {
	public int[] intersection(int[] nums1, int[] nums2) {
		// if(nums1.length > nums2.length){
		// 	int[] temp = new int[nums1.length];
		// 	temp = nums2;
		// 	nums2 = nums1;
		// 	nums1 = nums2;
		// }
		HashSet<Integer> hashSet = new HashSet<Integer>();
		HashSet<Integer> hashSet1 = new HashSet<Integer>();
		int count = 0;
		for(int i:nums1){
			hashSet.add(i);
		}
		for(int i:nums2){
			if(hashSet.contains(i)){
				hashSet1.add(i);
			}
		}
		int[] arr = new int[hashSet1.size()];
		Iterator<Integer> it = hashSet1.iterator();
		int i = 0;
		while(it.hasNext()){
			arr[i] = it.next();
			i++;
		}
		return arr;
	}
	public static void main(String args[]){
		intersectionChecker checker = new intersectionChecker();
		int[] nums1 = {1, 6, 1, 2, 2, 5, 6, 8, 8};
		int[] nums2 = {1, 6, 1, 2, 2, 5, 6, 8, 8};
		int[] n = checker.intersection(nums1, nums2);
		System.out.println(Arrays.toString(nums1));
		System.out.println(Arrays.toString(n));
	}
}
