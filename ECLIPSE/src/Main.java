
import java.io.*;

public class Main {
	public static void main (String args[]) throws IOException {
		String was = "was";
		String wer = "were";
		int richtig = 0;
		int gesamt = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENGLISCH UNREGELMAESSIGE VERBEN");
		System.out.println("Nur kleinbuchstaben sind erlaubt!");
		System.out.println("ENGLISCH UNREGELMAESSIGE VERBEN");
		System.out.println("be 2.Form:");
		String be = br.readLine();
		gesamt++;
		if (be == was) {
			System.out.println("Richtig, auch richtig ist were");
			richtig++;
		}else if(be == wer) {
			System.out.println("Richtig, auch richtig ist was");
			richtig++;
		}else {
			System.out.println("LEIDER FALSCH, richtig waere was oder were");
		}
	}
}
