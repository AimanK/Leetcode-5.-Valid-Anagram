 HINT:
 - Create two char arrays to represent each string, they are easy to sort using Arrays.sort, afterwards, iterate through to the length of one of the arrays to compare each letter together.
 
 
 SOLUTION:  
 - First we check the edge case if the two strings have equal lengths, if they do not, return false.
 - Then, we create two char arrays, and set each of them to the toCharArray() method.
 - We then use the Arrays.sort() method to sort these char arrays.
 - Create a for loop, iterate until the length of one of the strings (we already checked), and then do a simple if statement within that compares if s_chars[i] != t_chars[i], return false.
 - If end of program reached successfully, return true.
