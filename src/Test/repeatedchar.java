package Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class repeatedchar {

	public static void main(String[] args) {

		
		int a[] = {1,2,3,4,5,3,4,5,6};
		int total=a.length;
		int res=0;
		int count=0;
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		
		for(int i=0;i<total;i++) {
			
			for(int j=i;j<total;j++) {
				if(a[i]==a[j]) {
					
					
					count++;
					}
				map.put(a[i],count);
				
					
				}
			count=1;
		
			
			
		
				
			}
		System.out.println(map);
		}
		
	

}
