import java.util.*;
class printDemo{
	static void fun(int n){
		if(n==0){
			return;
		}
		fun(n-1);
		System.out.print(n+" ");
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		/*for(int i=1;i<=n;i++){
			System.out.print(i+" ");
		}*/
		fun(n);
	}
}
