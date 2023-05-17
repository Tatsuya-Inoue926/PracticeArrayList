
public class Main {

	public static void main(String[] args) {

		//商品を作る
		Item item1 = new Item("101","リンゴ", 300);
		Item item2 = new Item("102","キウイ", 500);
		Item item3 = new Item("103","バナナ", 200);

		Register regi = new Register();
		regi.addItem(item1);
		regi.addItem(item2);
		regi.removeItem(item2);
		regi.addItem(item3);
		regi.searchItem("102");

	}

}
