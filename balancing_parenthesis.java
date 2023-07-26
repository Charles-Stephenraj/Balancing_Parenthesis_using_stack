import java.util.*;
public class balancing_parenthesis
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String in=sc.next();
		Stack<Character>s=new Stack<Character>();
		for(int i=0;i<in.length();i++)
		{
			if(in.charAt(i)=='{' || in.charAt(i)=='[' || in.charAt(i)=='(')
			{
				s.push(in.charAt(i));
			}
			if(in.charAt(i)=='}' || in.charAt(i)==']' || in.charAt(i)==')')
			{
				char a=s.pop();
				if(in.charAt(i)==']' && a=='[')
				{
					continue;
				}
				else if(in.charAt(i)=='}' && a=='{')
				{
					continue;
				}
				else if(in.charAt(i)==')' && a=='(')
				{
					continue;
				}
				else
				{
					System.out.println("Not balanced");
					return;
				}
			}
		}
		System.out.println("Balanced");
	}
}