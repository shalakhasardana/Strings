package Strings;
//Assume you have a method isSubstring which checks if one word is a substring of another Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one call to isSubstring (i e , “waterbottle” is a rotation of “erbottlewat”)
public class IsSubstringCheck {

	public Boolean IsSubString(String string1, String string2) {
		if(string1.length()!=string2.length()) {
			return false;
		}
		String str1=string1+string1;
		String str2=string2;		
		return str1.contains(str2)? true:false;
	}

}
