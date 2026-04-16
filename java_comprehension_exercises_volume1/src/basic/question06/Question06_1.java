package basic.question06;

import java.io.IOException;

public class Question06_1 {

	public static void main(String[] args) throws IOException {

		// TODO:ここに実装
		int i = 0;
		while (i <= 3) {
			i++;
			System.out.println("こんにちは");
			System.out.println("Javaの学習中");
			System.out.println("繰り返しの演習");
			System.out.println("頑張ります");

			if (i == 4) {
				System.out.println("繰り返しが終了しました");
			}
		}
	}
}
