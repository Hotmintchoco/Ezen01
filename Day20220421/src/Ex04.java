<<<<<<< HEAD
=======
import java.util.Scanner;
>>>>>>> a84f3191324750278aa8c7a91b76a99776d5795f

public class Ex04 {

	public static void main(String[] args) {
		
<<<<<<< HEAD
		// �� �迭 ��Ұ� ������ true, Ʋ���� false
		int[] nArr1 = {10, 20, 3, 40, 50, 5};
		int[] nArr2 = {10, 20, 3, 40, 50};
		
		ArrayEqual(nArr1, nArr2);
	}
	
	static void ArrayEqual(int[] arr1, int[] arr2) {
		boolean isEqual = false;
		
		for (int i = 0; i < arr1.length; i++) {
			if(arr1.length != arr2.length) 
				break;
			
			if(arr1[i] == arr2[i]) {
				isEqual = true;
			} else {
				isEqual = false;
				break;
			}
		}
		System.out.println(isEqual);
	}
 
=======
		Scanner scanner = new Scanner(System.in);
		System.out.println("�� �ڸ� ������ �Է��ϼ���!");
		
		while (true) {
			int num = scanner.nextInt();
			
			if(10 <= num && num <= 99) {
				System.out.println("�� �ڸ� ����: "+num);
				break;
			}
			System.out.println("�� �ڸ� ������ �ƴմϴ�.");
		}
	}

>>>>>>> a84f3191324750278aa8c7a91b76a99776d5795f
}
