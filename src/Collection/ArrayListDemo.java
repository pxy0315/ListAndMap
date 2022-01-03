package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
	       List<Cat> cats=new ArrayList<Cat>();
	
	       Cat tomcat=new Cat();
	       tomcat.setName("Tom");
	
	       Cat jackcat=new Cat();
	       jackcat.setName("Jack");
	
	       Cat johncat=new Cat();
	       johncat.setName("John");
	
	       Cat anncat=new Cat();
	       anncat.setName("Ann");
	
	       // ��Ӻ�ɾ��Ԫ��
	       cats.add(tomcat);    // tom(0)
	       cats.add(jackcat);   // jack(1)-tom(0)
	       cats.add(johncat);   // john(2)-jack(1)-tom(0)
	       cats.add(2,anncat);  // �������Ԫ����ӵ���2��λ��
	                            // john(3)- anncat(2)-jack(1)-tom(0)
	       cats.remove(jackcat);         // ɾ��Ԫ��// john(2)- anncat(1)-tom(0)
	
	       // ���úͻ�ȡԪ��
	       cats.set(0,jackcat); // john(2)- anncat(1)-jack(0)
	
	       System.out.println(cats.get(0).getName());
	
	       // �ж�Ԫ�غ�Ԫ��λ��
	       System.out.println(cats.contains(jackcat));
	       System.out.println(cats.indexOf(jackcat));
	       
	       //----------------------------------------------
//	       // ���Ԫ��
//	       cats.clear();
//
//	       // �ж������Ƿ�Ϊ��
//	       System.out.println(cats.isEmpty());

	       // ��ArrayListת��Ϊ����
	       Cat[] c = cats.toArray(new Cat[0]);
	       System.out.println(c[0].getName());

	       // ��ArrayListת��Ϊ����2
		   Cat[] array =new Cat[cats.size()];
		   cats.toArray(array);

		   for (int i=0;i<array.length;i++) {
			  System.out.println(array[i].getName());
		   }
	       
	       //----------------------------------------------
		// ͨ������ֵ���ʣ���˳�������Ҳ��������ʡ�
	       for (int i=0;i<cats.size();i++) {
		     System.out.println(cats.get(i).getName());
	       }

	       // ͨ�����������ʣ�ʵ��˳�������
	       Iterator it = cats.iterator();
	       while(it.hasNext()) {
	          Cat cat = (Cat)it.next();
	          System.out.println(cat.getName());
	       }

	       // ͨ��ForEachѭ�����ʣ�ʵ��˳�������
	       for (Cat cat:cats){
		      System.out.println(cat.getName());
	       }


		
	}
}
