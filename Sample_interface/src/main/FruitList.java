package main;

import java.util.ArrayList;

import fruit.Fruit;

public class FruitList {
	private ArrayList<Fruit> fruitList;

	public FruitList() {
		// TODO 自動生成されたコンストラクター・スタブ
		this.fruitList = new ArrayList<Fruit>();
	}

	public void addFruit(Fruit fruit) {
		fruitList.add(fruit);
	}


	private void printFruitName(Fruit fruit) {
		System.out.println("この果物は" + fruit.getName() + "です");
		System.out.println("種は" + fruit.getSeed());
		System.out.println();
	}

	public void fruitName() {
		for(Fruit fruit: fruitList) {
			printFruitName(fruit);
		}
	}
}
