package rest;
import java.util.*;
import java.lang.*;
public class Arraywithout10 {
		public int[] calculate(int nums[]) {
			int t=0;
			for(int i=0;i<nums.length;i++) {
				for(int j=i+1;j<nums.length;j++) {
					if(nums[i]==10&&nums[j]!=10) {
						t=nums[i];
						nums[i]=nums[j];
						nums[j]=t;
					}
					for(int l=0;l<nums.length;l++) {
						if(nums[l]==10) {
							nums[l]=0;
						}
					}
				}
			}
			return nums;
		}
		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size of the array to be created:");
			int size=sc.nextInt();
			int[] ar=new int[size];
			System.out.println("Array element: ");
			for(int k=0;k<size;k++) {
				ar[k]=sc.nextInt();
			}
			Arraywithout10 a=new Arraywithout10();
			System.out.println("Array without10 = "+a.calculate(ar));
		}
}