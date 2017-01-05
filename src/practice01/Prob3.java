package practice01;
import java.util.*;

public class Prob3 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num=scanner.nextInt();
		int sum=0;
		
		if(num % 2 == 0){
			int i=0;
			while(i<=num){
				sum=sum+i;
				i=i+2;
			}
		}else{
			int i=1;
			while(i<=num){
				sum=sum+i;
				i=i+2;
			}
		}
		System.out.println("입력한 숫자: "+num+" , sum= "+sum);
		
		
		scanner.close();
	}

}
