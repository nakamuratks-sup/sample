package main;

import fruit.Apple;
import fruit.Fruit;
import fruit.Orange;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Main main = new Main();
		main.sampleFruit();
		main.sampleFruit(1);
	}

	public void sampleFruit() {
		// interface を使わない場合
		Orange orange = new Orange("温州みかん");
		Apple apple = new Apple("しなのゴールド");


		fruitName(apple);
		fruitName(orange);
	}

	public void fruitName(Fruit fruit) {
		System.out.println("この果物は" + fruit.getName() + "です");

		System.out.println("種は" + fruit.getSeed());
		System.out.println();
	}

	public void sampleFruit(int hoge) {
		// interface を使った場合

		FruitList fruitlist = new FruitList();

		fruitlist.addFruit(new Orange("温州みかん"));
		fruitlist.addFruit(new Apple("しなのゴールド"));

		fruitlist.fruitName();

	}



}
