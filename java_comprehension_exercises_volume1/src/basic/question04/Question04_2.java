package basic.question04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第7章 配列
 */

public class Question04_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// TODO 自動生成されたメソッド・スタブ
		int[] ageGroup = { 23, 33, 26, 25, 22 };
		System.out.println("4番目の人の年齢を入力してください");
		int temporaryAge = Integer.parseInt(reader.readLine());
		ageGroup[3] = temporaryAge;

		System.out.println("4番目人の年齢は" + ageGroup[3] + "です。");
		System.out.println("人数は" + ageGroup.length + "人です。");

		// TODO:ここに実装

	}

}
