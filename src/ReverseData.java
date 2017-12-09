
public class ReverseData {
	public void reverseString(String str)
	{
		//System.out.print("hu");
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseData d=new ReverseData();
		String str1="akbar";
		d.reverseString(str1);
	}

}
