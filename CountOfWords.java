package ibm;

import java.util.HashMap;

public class CountOfWords {
	
    public static int getWordCount(String strString) {
       //map to maintain data
    	HashMap<String, Integer> hashMap = new HashMap<>();
        //split based on space
        String[] words = strString.split(" ");
        for(String word : words) {
        	if(hashMap.containsKey(word)) {
        		Integer oldValue = hashMap.get(word);
        		hashMap.put(word, oldValue+1);
        	} else {
        		hashMap.put(word, 1);
        	}
        	
        }
        Integer count = 0;
        for(Integer value :   hashMap.values()) {
        	count = count+ value;
        }
        int[]   A = {1,2};
    	return count;

    }
    
    public static void main(String[] args) {
    	System.out.println(getWordCount("get Word Count"));
	}

}
