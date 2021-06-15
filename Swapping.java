public class Swapping {

	public static void main(String[] args) {
		int a = 2, b = 3;
		System.out.println("Before swapping: ");
		System.out.println("a = "+a +" b = "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping: ");
		System.out.println("a = "+a +" b = "+b);

	}

}
