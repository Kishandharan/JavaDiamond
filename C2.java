package pkg1;

public class C2 {
	public static void main(String[] args) {
		String word = "FunWithProgramming";
		int len1 = word.length();
		//Working code
		for(int i = 0; i<len1; i++) {
			String clip = word.substring(0,i+1);
			System.out.println(clip);
		}
		
		
//		String clip1;
//		clip1 = word.substring(0,6);
//		System.out.println(clip1);
//		clip1 = word.substring(0,5);
//		System.out.println(clip1);
//		clip1 = word.substring(0,4);
//		System.out.println(clip1);
		for(int i = len1; i>0; i--) {
			String clip = word.substring(0,i-1);
			System.out.println(clip);
		}
	}
}
