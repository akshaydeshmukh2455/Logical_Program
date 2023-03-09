package string_program;

public class CountCharacter {

	public static void main(String[] args) {
		
		String str="Welcome to java";
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) !=' ')
			{
				count++;
			}
		}
		System.out.println("Total number of character in string: "+count);

	}

}
