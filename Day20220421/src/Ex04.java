
public class Ex04 {

	public static void main(String[] args) {
		
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
 
}
