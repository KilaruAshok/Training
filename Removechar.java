import java.util.*;
public class RemoveChar {  

    public static void main(String[] args) {  
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		System.out.println("Enter charchter");
		char c = sc.next().charAt(0);
		System.out.println("Output after removing " + removeChar(str,c));
		  
           }  
            public static String removeChar(String s, char c) {
        StringBuffer buf = new StringBuffer(s.length());
        buf.setLength(s.length());
        int current = 0;
        for (int i = 0; i < s.length(); i++) {
 
        	// charAt() Returns the char value at the specified index. An index ranges from 0 to length() - 1.
			// The first char value of the sequence is at index 0, the next at index 1, and so on, as for array indexing.
            char cur = s.charAt(i);
            if (cur != c) buf.setCharAt(current++, cur);
        }
        return buf.toString();
    }
}
