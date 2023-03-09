package string_program;

public class PalindromeString {

	public static void main(String[] args) {
		String str="abc";
		
		String rev=" ";
		 String org_str=str;
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		if(org_str.equals(rev))
		{
			System.out.println(org_str+" is a palindrome string ");
		}
		else
		{
			System.out.println(org_str+" is not a palindrome string ");
		}
	}

}
