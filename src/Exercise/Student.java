package Exercise;


class Student implements Comparable{
	private String number;
	private String name;
	private int age;
	public Student(String number,String name,int age) {
		this.number=number;
		this.name=name;
		this.age=age;
	}
	public String getNumber() {
		return this.number;
	}
	public String getName() {
		return this.name;
	}
	public int  getage() {
		return this.age;
	}
	public void setNumber(String number) {
		this.number=number;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int compareTo(Object o) {
	      if (!(o instanceof Student))
	        throw new RuntimeException("不是Student对象");
	      Student p = (Student) o;
	      if (this.age > p.age)
	        return 1;
	      if (this.age == p.age){
	        return this.name.compareTo(p.name);
	      }
	      return -1;
	}
}
