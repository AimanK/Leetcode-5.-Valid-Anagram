import java.util.Arrays;
class Main {
  public static void main(String[] args) {

     /**
    Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
    **/

    
    String s = "anagram";
    String t = "nagaram";

    System.out.println(isAnagram(s,t));


    /**
    SOLUTION:  
    - First we check the edge case if the two strings have equal lengths, if they do not, return false.
    - Then, we create two char arrays, and set each of them to the toCharArray() method.
    - We then use the Arrays.sort() method to sort these char arrays.
    - Create a for loop, iterate until the length of one of the strings (we already checked), and then do a simple if statement within that compares if s_chars[i] != t_chars[i], return false.
    - If end of program reached successfully, return true.
    
    BIG TIP: Create two char arrays to represent each string, they are easy to sort using Arrays.sort, afterwards, iterate through to the length of one of the arrays to compare each letter together.
    **/
    
  }

  public static boolean isAnagram(String s, String t) {
       
       if (s.length() != t.length())
       {
           return false;
       }
        
        int string_length = s.length();
        
        
        char[] s_chars = s.toCharArray();

        char[] t_chars = t.toCharArray();
        
        Arrays.sort(s_chars);
        Arrays.sort(t_chars);
        
        
        
        for (int i = 0; i < string_length; i++)
        {
            if (s_chars[i] != t_chars[i])
            {
                return false;
            }
        }
        
        
        
        return true;
    }
}
