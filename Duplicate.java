package rest;
import java.util.*;
import java.lang.*;

public class Duplicate {
	public static int remove(int ar[],int n) {
		int[] temp=new int[n];
		int j=0;
		for(int i=0;i<n-1;i++) {
			if (ar[i] != ar[i+1]) {
				temp[j++]=ar[i];
			}
		}
	temp[j++]=ar[n-1];
	for(int i=0;i<j;i++) {
		ar[i]=temp[i];
	}
	return j;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {10,20,20,30,50,50,60};
		int len=ar.length;
		int length=remove(ar,len);
		for(int i=0;i<length;i++)
			System.out.print(ar[i]+" ");
	}
}
