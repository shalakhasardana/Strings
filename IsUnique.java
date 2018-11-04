package Strings;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

//implement an algorithm to determine if a string has all unique characters
public class IsUnique {
	//using additional Structure for example HashTable
	public Boolean usingHashTable(String string) {
		char[] characters=string.toCharArray();
		Hashtable<Character,Integer> hash=new Hashtable<Character,Integer>();
		int count=0;
		for(int i=0;i<characters.length;i++) {
			if(hash.containsKey(characters[i])) {
				int number=hash.get(characters[i]);
				hash.put(characters[i], number+1);
				
			}else {
				hash.put(characters[i], count+1);
				
			}
		}
		
		Set<Character> set=hash.keySet();
	    for(Character character:set) {
	    	if(hash.get(character)>1) {
	    		return true;
	    	}
	    }
		return false;
	}
	
	
	//assuming characters are only in ASCII 
	public Boolean check(String string) {
		Integer[] ascii=new Integer[256];
		for(int i=0;i<ascii.length;i++) {
			ascii[i]=0;
		}
		for(int i=0;i<string.length();i++) {
			int index=string.charAt(i)-1;
			if(ascii[index]>1) {
				return false;
			}
			ascii[index]=ascii[index]+1;
		}
		
		return true;
	}

}
