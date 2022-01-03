package Exercise;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class BookDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        List<Book> books = new ArrayList<Book>();
        Map<String,Book> books1 = new HashMap<String,Book>();
        System.out.print("请输入书籍数量：");
        int numbers=input.nextInt();
        for (int i=0;i<numbers;i++) {
        	String num,name,press;
        	int price;
        	num=input.next();
        	name=input.next();
        	price=input.nextInt();
        	press=input.next();
        	Book x=new Book(num,name,price,press);
        	books.add(x);
        	books1.put(num, x);
        }
        
      //遍历所有书本
        Iterator it = books.iterator();
        while(it.hasNext()){
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }

        Iterator iter = books1.entrySet().iterator();
		while(iter.hasNext()) {
		   Map.Entry entry = (Map.Entry)iter.next();
		   System.out.println("next : "+ entry.getKey() +" - "+((Book)entry.getValue()).getName());
		}
		

	}

}
