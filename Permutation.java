package Strings;

////Check if two strings are permutation of each other

public class Permutation {
	//considering string are having ascii character only
	public Boolean isPermutation(String string1,String string2) {
		string1.trim(); string2.trim();
		if(string1.length()!=string2.length()) {
			return false;
		}
		
		if(string1==null) {
			System.out.println("Strings are null");
			return true;
		}
		
		Integer[] str1=new Integer[256];
		for(int i=0;i<str1.length;i++) {
			str1[i]=0;
		}
		for(int i=0;i<string1.length();i++) {
		   	int index=string1.charAt(i);
		   	str1[index]=str1[index]+1;
		}
		
		for(int i=0;i<string2.length();i++) {
			int index=string2.charAt(i);
			str1[index]=str1[index]-1;
			if(str1[index]<0) {
				return false;
			}
			
		}
		return true;
		
	}

}
