import java.util.ArrayList;

public class Register {

	//Itemクラス内の情報をリストに入れる
	private ArrayList <Item> ItemList = new ArrayList <> ();

	public void addItem( Item it ) {
		ItemList.add(it);
		}
		
	
	public void removeItem(Item it ) {
		ItemList.remove(it);
		}
	
	public void searchItem(String number) {
		
		for( Item i : ItemList ) {
			if(i.getNumber().equals(number)) {
				System.out.println(i.getName());
				System.out.println(i.getNumber());
				return;
			}else {
				System.out.println("商品が見つかりませんでした");
				return;
			}
		}
		
	}
}

