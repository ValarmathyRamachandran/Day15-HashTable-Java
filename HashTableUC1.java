package bridgeLabz.Java.Practice;
 	
	public class HashTableUC1   
	{  
	     public static void main(String[] args) {
	    	 HashTableUC1 hm=new HashTableUC1();
	        String str = "To be or not to be";  
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
	                }  
	            }  
	        }  
	          
	        //Displays the each character and their corresponding frequency  
	        System.out.println("Characters and their corresponding frequencies");  
	        for(i = 0; i <freq.length; i++) {  
	            if(string[i] != ' ' && string[i] != '0')  
	                System.out.println(string[i] + "-" + freq[i]);  
	        }  
	    }  
	}  