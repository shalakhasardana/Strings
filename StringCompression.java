package Strings;
/*
* Implement a method to perform basic string compression using
* the counts of repeated characters. For example, the string aabcccccaaa
* would become a2b1c5a3. If the "compressed" string would not become
* smaller than the original string, your method should return the original string.
*/

public class StringCompression {

	public String compressionFunction(String input) {
	    char[] CharArray=input.toCharArray();
	    int LastIndex=1;
	    char LastCharacter=input.charAt(0);
	    StringBuffer str=new StringBuffer();
	    for(int i=1;i<input.length();i++) {
	    	if(CharArray[i]==LastCharacter) {
	    		LastIndex++;
	    	}else {
	    		compressUtil(LastCharacter,LastIndex,str);
	    		LastIndex=1;
	    		LastCharacter=CharArray[i];
	    	}
	    }
	    str.append(LastCharacter).append(String.valueOf(LastIndex));
	    String CompString=new String(str);
		
		return input.length()>CompString.length()?CompString:input;
	}

	private void compressUtil(char lastCharacter, int lastIndex, StringBuffer str) {
		str.append(lastCharacter);
		String LastCharacterIndex=String.valueOf(lastIndex);
		str.append(LastCharacterIndex);
	}

}
