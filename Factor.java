import java.util.*;
class Factor{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n,sum=0,i=0;
		System.out.println("Enter number:");
		n=sc.nextInt();
		for(i=1;i<n;i++){
			if(n%i==0){
				sum=sum+i;
			}
		}
				
		
			System.out.println("SUM:"+sum);
		
			if(sum==n){
				System.out.println("perfect number");
			}
			else{
				System.out.println("not perfect number");
			}
	}
}

