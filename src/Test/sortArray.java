package Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sortArray {

	public static void main(String[] args) {
		int a[]={1,2,5,6,3,2};  
		int b[]={44,66,99,77,33,22,55};
		//Arrays.sort(b);
	//	System.out.println(b[1]);
		//sort using collections 
		Integer m[]={1,2,5,6,3,2};  
		Integer n[]={44,66,99,77,33,22,55};
		List<Integer> ls=Arrays.asList(n);
		Collections.sort(ls);
		System.out.println(ls.get(1));
		
	}

}
