package rest;
import java.lang.*;
import java.util.*;
public class Oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arnum[]= {20,42,78,91,43,25,89,84,31};
		int i=0;
		System.out.println("Main array :"+Arrays.toString(arnum));
	while(i<arnum.length&&arnum[i]%2==0)
		i++;
		for(int j=i+1;j<arnum.length;j++) {
		if(arnum[j]%2==0) {
			int temp=arnum[i];
			arnum[i]=arnum[j];
			arnum[j]=temp;
			i++;
		}
		}
		System.out.println("New array : "+Arrays.toString(arnum));
	}
}
