import java.util.Random;
import java.util.Scanner;

	class gæt2 {

	public static void main( String[] args) {
		//System.out.println("Gæt et tal");
		Scanner tastaturinput = new Scanner (System.in);
		Random r = new Random();
		int tilfældigtTal = r.nextInt(99)+1;
		int brugerinput = 0;

		while(brugerinput != tilfældigtTal) {
			System.out.println("gæt et tal");
			brugerinput = tastaturinput.nextInt();

			if(brugerinput < tilfældigtTal) {
				System.out.println("Tallet er for lavt");
			}

			else if(brugerinput > tilfældigtTal) {
				System.out.println("Tallet er for højt");
			} 

			else {
				System.out.println("tallet er korrekt");
			}
		}

	}


}