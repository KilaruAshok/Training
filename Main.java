import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    String s1 = s.nextLine();
	    int j=s1.length();
	    String s2="";
	     for (int i = j - 1 ; i >= 0 ; i--){
            s2 = s2 + s1.charAt(i);
	     }
	    System.out.println(s2);
	     StringBuilder input1 = new StringBuilder();
        input1.append(s1);
        input1.reverse();
        System.out.println(input1);
	}
}
