
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class MyHashMap {
	private final int ARRAY_SIZE = 100;
	private List<List<Integer>> parentKeyList;
	private List<List<Integer>> parentValueList;

	/** Initialize your data structure here. */
	public MyHashMap() {
		parentKeyList = new ArrayList<>(ARRAY_SIZE);
		parentValueList = new ArrayList<>(ARRAY_SIZE);
		for(int i = 0; i < ARRAY_SIZE; i++){
			parentKeyList.add(null);
			parentValueList.add(null);
		}
	}
	
	public void put(int key, int value) {
		int index = key%ARRAY_SIZE;
		List<Integer> childKeyList = parentKeyList.get(index);
		List<Integer> childValueList = parentValueList.get(index);
		if(childKeyList == null){
			List<Integer> keyList = new LinkedList<>();
			List<Integer> valueList = new LinkedList<>();
			keyList.add(key);
			valueList.add(value);
			parentKeyList.set(index, keyList);
			parentValueList.set(index, valueList);
		}
		else{
			if(!childKeyList.contains(key)){
				childKeyList.add(key);
				childValueList.add(value);
			}
		}
	    
	}

	public int get(int key){
		
	}
	
	public void remove(int key) {
		int index = key%ARRAY_SIZE;
		List<Integer> childKeyList = parentKeyList.get(index);
		List<Integer> childValueList = parentValueList.get(index);
		if(childKeyList != null){
			childKeyList.remove(Integer.valueOf(key));
			childValueList.remove(Integer.valueOf(value));
		}
	    
	}
	
	/** Returns true if this set contains the specified element */
	public boolean contains(int key) {
		int index = key % ARRAY_SIZE;
		List<Integer> childList = parentList.get(index);
		return childList != null && childList.contains(key);
	}
    }
    
    /**
     * Your MyHashSet object will be instantiated and called as such:
     * MyHashSet obj = new MyHashSet();
     * obj.add(key);
     * obj.remove(key);
     * boolean param_3 = obj.contains(key);
     */