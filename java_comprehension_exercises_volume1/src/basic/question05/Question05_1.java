package basic.question05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第8章 条件分岐
 */

public class Question05_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("年齢を入力してください");
		int Age = Integer.parseInt(reader.readLine());

		if (Age >= 20) {

			System.out.println("20歳以上なので、お酒を提供することが可能です。");
		}

		if (Age < 20) {
			{
				// resの値が5だった場合、以下の処理を実行
				System.out.println("20歳未満なので、お酒の提供ができません");

			}
		}
	}
}