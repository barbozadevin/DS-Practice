
public class Fibonacci {
	
	static int fib(int num) {
		int count=num;
		int first=0,second=1,totSum=0;
		
		while(count>0) {
			totSum=first+second;
			first=second;
			second=totSum;
			count-=1;
		}
		return totSum;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n=7;
			int result=fib(n);
			System.out.println(result);
	}

}
