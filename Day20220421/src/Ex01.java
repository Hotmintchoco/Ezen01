import java.util.Scanner;

public class Ex01 {
	
	static int num1, num2, num3;

	public static void main(String[] args) {
		
		input();
		
		int max =  calu();
		
		output(max);
	}
	
	static void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 3개 입력: ");
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
	}
	
	static int calu() {
		int max = num1;
		
		if (num2 > max) {
			if(num2 > num3)
				max = num2;
			else
				max = num3;
		} else if (num3 > max) 
			max = num3;
		return max;
	}
	
	static void output(int num) {
		System.out.println("max :" + num);
	}
}
