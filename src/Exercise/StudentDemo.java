package Exercise;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
public class StudentDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        Set<Student> students = new TreeSet<Student>();
        while(true){
            String index = input.next();
            if("exit".equals(index)){
                break;
            }
            String name = input.next();
            int age = input.nextInt();
            Student x = new Student(index,name,age);
            students.add(x);
        }
        Iterator<Student> it = students.iterator();
        while(it.hasNext()){
            Student student = (Student)it.next();
            System.out.println("name:" + student.getName());
        }

	}

}
