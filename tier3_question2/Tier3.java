import java.util.*;
public class Tier3 {
	public static void main(String args[]){

		//Creating a List
		List<String> list=new ArrayList<String>();
		//Adding elements in the List
		list.add("goodforbad");
		list.add("day");
		list.add("badforgood");
		list.add("queenandking");
		list.add("kingandqueen");
		list.add("night");

		for(int i = 0; i < list.size() - 1; i++) {
				for(int j = i + 1; j < list.size(); j++) {
					if(isAnagram(list.get(i), list.get(j))) {
						 System.out.println(list.get(i) + " " + list.get(j));
					}
				}
		}
	}

  	private static boolean isAnagram(String s1, String s2) {
        // In order for two String to be anagrams, they must have the same length.
		  if(s1.length() != s2.length()) {
			  return false;
		  }
		  // If s2 does not contain even one of s1's chars return false.
		  for(int i = 0; i < s1.length(); i++) {
			  if(!s2.contains("" + s1.charAt(i))) {
				  return false;
			  }
		  }
		  return true;
	}

}
