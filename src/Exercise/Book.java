package Exercise;

public class Book {
		private String num;//����
		private String name;//����
		private int price;//����
		private String press;//������
		
		public Book(String num,String name,int price,String press) {
			this.num=num;
			this.name=name;
			this.price=price;
			this.press=press;
		}
		
		public String getNum() {
			return this.num;
		}
		public String getName() {
			return this.name;
		}
		public int getPrice() {
			return this.price;
		}
		public String getPress() {
			return this.press;
		}
		public void setNum(String num) {
			this.num=num;
		}
		public void setName(String name) {
			this.name=name;
		}
		public void setPrice(int price) {
			this.price=price;
		}
		public void setPress(String press) {
			this.press=press;
		}
}
