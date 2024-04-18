package Test;

public class getSecondSmallestElementArray {

	public static void main(String[] args) {
		int a[]={1,2,5,6,3,2};  
		int b[]={44,66,99,77,33,22,55};
		System.out.println(getsecondsmallestelement(a,6));
		
	}

	public static int getsecondsmallestelement(int a[], int total) {
		int temp;
		for(int i=0;i<total;i++) {
			for(int j=i+1;j<total;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[j]=temp;
					a[i]=a[j];
				}
			}
		}
		return a[1];
		
	
	}
}
