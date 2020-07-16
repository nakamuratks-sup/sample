package fruit;

// implements ～でインタフェースクラスの利用を宣言
public class Apple implements Fruit {

	private String name;
	final private String seed = "あります。";

	public Apple(String name) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.name = name;
	}

	// インタフェースクラスで宣言したメソッドの実装を利用するクラスで定義する
	@Override
	public String getName() {
		// TODO 自動生成されたメソッド・スタブ
		return "長野県産の" + name;
	}

	@Override
	public String getSeed() {
		// TODO 自動生成されたメソッド・スタブ
		return seed;
	}

}
