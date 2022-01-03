package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// �½�HashSet
		Set<Cat> cats = new HashSet<Cat>();
		
		Cat tomcat=new Cat();
        tomcat.setName("Tom");

        Cat jackcat=new Cat();
        jackcat.setName("Jack");

        Cat johncat=new Cat();
        johncat.setName("John");

		cats.add(tomcat);
		cats.add(tomcat);
		cats.add(jackcat);
		cats.add(johncat);
		
	    // ͨ�����������ʿ��Կ�����Set���������ظ�Ԫ�ء�
	        Iterator<Cat> it = cats.iterator();
	        while(it.hasNext()) {
	           Cat cat = (Cat)it.next();
	           System.out.println(cat.getName());
	        }

	}
}
