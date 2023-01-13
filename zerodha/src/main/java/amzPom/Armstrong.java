package amzPom;

public class Armstrong {
	public static void main(String[] args) {
		int num=153;
		int temp,sum=0,r;
		temp=num;
		while(num>0) {
			r=num%10; 
			sum=sum+r*r*r; 
			num/=10; 
			 
		}
		if(temp==sum) {
			System.out.println("Armstrong Number:"+temp);
		}else {
			System.out.println("Not Armstrong Number:"+temp);
		}
	}

}
