import java.util.Scanner;

public class fizzbuzz{

	public static void main(String[] args){
		Scanner lukija = new Scanner(System.in);
		int annettuluku = new Integer(lukija.nextLine());
		
		for (int i = 0; i < annettuluku; i++){
			if (i % 3 == 0 && i % 5 == 0){
				System.out.println("FizzBuzz");
			}
			else if (i % 3 == 0){
			 	System.out.println("Fizz");
			}
			else if (i % 5 == 0){
				System.out.println("Buzz");
			}
			else{
				System.out.println(i);
			}
		}
	}
}
