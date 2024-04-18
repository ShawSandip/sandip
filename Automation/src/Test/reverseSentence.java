package Test;

public class reverseSentence {

	public static void main(String[] args) {
		String str="I am good";
		String rev="";
		String s[]=str.split(" ");
		for(int i=0;i<s.length;i++) {
			rev=s[i]+ " " +rev;
		}
		System.out.println(rev);
	}

}
