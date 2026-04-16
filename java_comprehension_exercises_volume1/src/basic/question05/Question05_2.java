package basic.question05;

import java.io.IOException;

/**
 * 第8章 条件分岐
 */

public class Question05_2 {

	public static void main(String[] args) throws IOException {
		int[] ageGroup = { 3, 5, 7, 9 };
		if (ageGroup[3] == 3) {

			System.out.println("4番目の要素の値は3です");
		}
		if (ageGroup[3] == 5) {

			System.out.println("4番目の要素の値は3です");
		}
		if (ageGroup[3] == 7) {

			System.out.println("4番目の要素の値は3です");
		}

		if (ageGroup[3] != 3 && ageGroup[3] != 5 && ageGroup[3] != 7) {

			System.out.println("4番目の要素の値は3、5、7以外の値です。");
		}
	}
}
