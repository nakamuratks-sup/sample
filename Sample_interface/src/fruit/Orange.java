package fruit;

public class Orange implements Fruit {

	private String name;

	public Orange(String name) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.name = name;
	}
	@Override
	public String getName() {
		// TODO 自動生成されたメソッド・スタブ
		return name;
	}

	@Override
	public String getSeed() {
		// TODO 自動生成されたメソッド・スタブ
		return new String("時々あります。");
	}

}
