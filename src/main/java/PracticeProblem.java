public class PracticeProblem {
	
	public static void main(String args[]) {
		System.out.println(countWords("My name is yaseman",'m'));
		
	}
	public static boolean isPalindrome(String word){
		boolean answer= true;
		word= word.replaceAll(" ", "");
		word= word.toLowerCase();
		for (int i =0; i<word.length();i++){
			if (word.charAt(i)!=word.charAt(word.length()-i-1)){
				answer= false;
			}	
		}
		return answer; 
	}
	public static int getAge(String[] nameArr, int[] ageArr, String name){
		
		int age=-1;
		for (int i= 0; i <nameArr.length; i++){
			if (nameArr[i]== name){
				age=ageArr[i];
			}
		}
		return age;
	}
	public static int countWords(String word, char letter){
		word =word.toLowerCase();
		String[] wordArr= word.split(" ");
		int  count=0;
		for (int i =0; i< wordArr.length;i++){
			for (int z=0; z<wordArr[i].length();z++){
				if (wordArr[i].charAt(z)==letter){
					count++;
					z=wordArr[i].length();
				}
			}
		}

		return count;
	}
}
