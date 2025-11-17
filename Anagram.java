/** Functions for checking if a given string is an anagram. */
public class Anagram {
	public static void main(String args[]) {
		// Tests the isAnagram function.
		System.out.println(isAnagram("silent","listen"));  // true
		System.out.println(isAnagram("William Shakespeare","I am a weakish speller")); // true
		System.out.println(isAnagram("Madam Curie","Radium came")); // true
		System.out.println(isAnagram("Tom Marvolo Riddle","I am Lord Voldemort")); // true

		// Tests the preProcess function.
		System.out.println(preProcess("What? No way!!!"));
		
		// Tests the randomAnagram function.
		System.out.println("silent and " + randomAnagram("silent") + " are anagrams.");
		
		// Performs a stress test of randomAnagram 
		String str = "1234567";
		Boolean pass = true;
		//// 10 can be changed to much larger values, like 1000
		for (int i = 0; i < 10; i++) {
			String randomAnagram = randomAnagram(str);
			System.out.println(randomAnagram);
			pass = pass && isAnagram(str, randomAnagram);
			if (!pass) break;
		}
		System.out.println(pass ? "test passed" : "test Failed");
	}  

	// Returns true if the two given strings are anagrams, false otherwise.
	public static boolean isAnagram(String str1, String str2) {
		str1 = preProcess(str1);
		str2 = preProcess(str2);

		 if(str1.length()==str2.length()){
			for(int i=0;i<str1.length();i++){
			for(int j=0;j<str2.length();j++){
			   if(str1.charAt(i)== str2.charAt(j)){
						str2= str2.substring(0, j) + str2.substring(j + 1);
						break;

						
						
						
					

			}
			

		 }

		 
			
		 
		 
			
			
		 }
				
				 
		
		}
		return str2.length() == 0;
	}

	
	   
	// Returns a preprocessed version of the given string: all the letter characters are converted
	// to lower-case, and all the other characters are deleted, except for spaces, which are left
	// as is. For example, the string "What? No way!" becomes "whatnoway"
	public static String preProcess(String str) {
		
		for (int i =0; i<str.length();i++){
			if(str.charAt(i)== '!' ||str.charAt(i)== '?' ||str.charAt(i)== '!' || str.charAt(i)== ' '){
				str = str.substring(0, i) + str.substring(i + 1);
            i--;

			}


		}
		String strfinal= str.toLowerCase();
		return strfinal;
	} 
	   
	// Returns a random anagram of the given string. The random anagram consists of the same
	// characters as the given string, re-arranged in a random order. 
	public static String randomAnagram(String str) {
		int randomInt;
		String strnew= str;
		String strfinal= "";
		for (int i =0; i<str.length();i++){
			randomInt = (int)(Math.random() * strnew.length());
			strfinal= strfinal + strnew.charAt(randomInt);
			strnew= strnew.substring(0, randomInt) + strnew.substring(randomInt + 1);
			

		}
			
		


		//int randomInt = (int)(Math.random() * (max - min + 1) + min);
		return strfinal;
	}
}

