import java.util.Scanner;


public class Repeated {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the element:");
		int n=s.nextInt();
		int a[]=new int[n];
		for(int k=0;k<n;k++){
			a[k]=s.nextInt();
		}
		System.out.println("The repeated elements are:");
		for(int i=0;i<n;i++){
			
			for(int j=i+1;j<n;j++){
				if(a[i]==a[j])
				{
				System.out.println(+a[i]);
				}
			}
		}
	}
}
