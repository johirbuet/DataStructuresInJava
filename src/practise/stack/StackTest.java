package practise.stack;

import java.util.Stack;


public class StackTest {
	public static void main(String[] args) {
		// Also in stack the reference peeked value is updated in the stack also
		Stack<Person> stack = new Stack<>();
		stack.push(new Person("Name1", 27));
		stack.push(new Person("Name2",28));
		stack.push(new Person("Name3",25));
		System.out.println(stack);
		Person p = stack.peek();
		p.name = "UpdatedName";
		System.out.println(stack);
		
		// But the same doesn't work for primitive types and String
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
