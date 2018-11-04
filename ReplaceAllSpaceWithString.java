package Strings;
/*
 * 
URLify a given string (Replace spaces is %20)
Input : "Mr John Smith   ", 13
Output : Mr%20John%20Smith

*/

public class ReplaceAllSpaceWithString {

	public String replaceSpaceFunction(String input) {
		char[] InputArray=input.toCharArray();
		int OriginalLength=input.length()-1;
		int Newlength=input.trim().length();
		for(int i=Newlength-1;i>=0;i--) {
			if(input.charAt(i)==' ') {
				InputArray[OriginalLength]='0';
				InputArray[OriginalLength-1]='2';
				InputArray[OriginalLength-2]='%';
				OriginalLength=OriginalLength-3;
			}else {
				char character=input.charAt(i);
				InputArray[OriginalLength]=character;
				OriginalLength--;
			}
		}
		return new String(InputArray);
	}

}
