import java.util.Arrays;
import java.util.Random;

public class Ex06 {

	public static void main(String[] args) {
		int[] nArr = new int[10];
		Random rand = new Random();
		
		for (int i = 0; i < nArr.length; i++) {
//			nArr[i] = (int)(Math.random()*10);
			nArr[i] = rand.nextInt(10);
		}
		
		for (int i = 0; i < nArr.length - 1; i++) {
			do {
				if(nArr[i] == nArr[i+1]) {
//					nArr[i+1] = (int)(Math.random()*10);
					nArr[i+1] = rand.nextInt(10);
				}
			} while (nArr[i] == nArr[i+1]);
		}
		
		System.out.println(Arrays.toString(nArr));
	}

}
