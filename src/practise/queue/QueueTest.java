package practise.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	public static void main(String[] args) {
		// The peeked refrence value is also updated in the queue
		Queue<Person> qu = new LinkedList<>();
		qu.offer(new Person("Johir", 27));
		qu.offer(new Person("Sifat",28));
		qu.offer(new Person("Muhib",25));
		System.out.println(qu);
		Person p = qu.peek();
		p.name = "Khokon";
		System.out.println(qu);
		
		// But for primitinve type and string it doesn't work
		Queue<Integer> iqu =new LinkedList<>();
		iqu.add(20);
		iqu.add(60);
		iqu.add(100);
		System.out.println(iqu);
		Integer a = iqu.peek();
		a = 30;
		System.out.println(iqu);
	}
	
	private static class Person{
		String name;
		int age;
		public Person(String name,int age) {
			this.name = name;
			this.age = age;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return this.name+" "+this.age;
		}
	}
}
