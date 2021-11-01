package bridgeLabz.Java.Practice;
import java.util.Scanner;

public class HashTableUC3 
	{  
		public int hashCode(){
		    String str = null;
			return (int) str.hashCode();
		  }
		
	     public static void main(String[] args) {
	    	 HashTableUC1 hm=new HashTableUC1();
	        String str = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";  
	        int[] freq = new int[str.length()];  
	        int i, j;  
	          
	        //Converts given string into character array  
	        char string[] = str.toCharArray();  
	          
	        for(i = 0; i <str.length(); i++) {  
	            freq[i] = 1;  
	            for(j = i+1; j <str.length(); j++) {  
	                if(string[i] == string[j]) {  
	                    freq[i]++;  
	                      
	                    //Set string[j] to 0 to avoid printing visited character  
	                    string[j] = '0'; 
	                  //Displays the each character and their corresponding frequency  
	        	        System.out.println("Characters and their corresponding frequencies");  
	        	       
	        	        for(i = 0; i <freq.length; i++) {  
	        	            if(string[i] != ' ' && string[i] != '0')  
	        	                System.out.println(string[i] + "-" + freq[i]); 
	        	        }  
	                    String word;
	                    Scanner scanner = new Scanner(System.in);
	                    System.out.println("Enter word you want to delete from Sentence");
	                    word = scanner.nextLine();
	                    // Deleting word from
	                    str = str.replaceAll(word, "");
	             
	                    System.out.println("Output Sentence\n" + str);
	                }
	            }
	        }
	     }
	}
	        
	             
	        
	
