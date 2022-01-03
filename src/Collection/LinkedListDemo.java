package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

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
		
		// �½�һ��LinkedList
	 LinkedList<Cat> stack=new LinkedList<Cat>();
	 
     // Ԫ��ѹ��ջ��
     stack.push(tomcat);
     stack.push(jackcat);
     stack.push(johncat);
     stack.push(anncat);

     // ɾ��ջ��Ԫ��
     System.out.println("stack.pop():"+stack.pop().getName());

     // ȡ��ջ��Ԫ��
     System.out.println("stack.peek():"+stack.peek().getName());

	}
}
