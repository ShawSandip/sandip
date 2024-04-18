package Test;

public class reversestring {

	public static void main(String[] args) {
String str="Sandip";
String rev="";
for(int i=0;i<str.length();i++) {
	rev=str.charAt(i)+rev;
}
System.out.println(rev);
	}

}
