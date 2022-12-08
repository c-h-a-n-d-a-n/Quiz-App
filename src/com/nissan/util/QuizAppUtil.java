package com.nissan.util;

import java.util.HashMap;
import java.util.Map;

public class QuizAppUtil {

	public static Map<String, String> getStatesAndCapitals() {
		Map<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("Maharashtra", "Mumbai");
        hashMap.put("Madhya Pradesh", "Bhopal");
        hashMap.put("Kerala", "Thiruvnanthpuram");
        hashMap.put("Goa", "Panaji");
        hashMap.put("Assam", "Dispur");
        hashMap.put("Andhra Pradesh", "Hyderabad");
        hashMap.put("Arunachal Pradesh", "Itanagar");
        hashMap.put("Bihar", "Patna");
        hashMap.put("Chhattisgarh", "Raipur");
        hashMap.put("Gujarat", "Gandhinagar");
        hashMap.put("Haryana", "Chandigarh");
        hashMap.put("Himachal Pradesh", "Shimla");
        
        return hashMap;
	}
}
