public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static boolean validIndex(int[] array, int num) {
		try {
			array[num] = 0;
			return true;
		}catch(ArrayIndexOutOfBoundsException e) {
			return false;
		}
	}
	public static int divide(int num1, int num2) {
		try {
			return num1 / num2;
		}catch(Exception e) {
			return 0;
		}
	}
	public static int safeConvertStringtoInt(String s) {
		try {
			return Integer.parseInt(s);
		}catch(Exception e) {
			return 0;
		}

	}

}
