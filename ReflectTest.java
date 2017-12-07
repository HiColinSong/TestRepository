/**
 * 
 */
package com.b510.test;

import java.util.List;

/**
 * @author yunlin.song
 *
 */
public class ReflectTest  {

	/**
	 * @param args
	 */
//	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
//		// TODO Auto-generated method stub
//		System.out.println("a");
//		Object instance =null;
//		try {
//			Class<?> klass=Class.forName("java.util.ArrayList");
//			instance=klass.isInstance("Hello");
//			if (instance instanceof List<?>) {
//				System.out.println("instance is a list");
//			String a = null;	
//			Box2<String> b1=new Box2<String>("22");
//			
//			
//			
//			}
//				
//		}catch(ClassNotFoundException e)		{
//			
//		}
//		if (instance instanceof List)		{
//			
//			System.out.println("Object is a List");
//		}
//	}
	public static void main(String[] args) {
		Box2<String> box=new Box2<>("ff");
		myPrintln(box.getData());
		Box2<Integer> box2=new Box2<>(123456);
		myPrintln(box2.getData());
	}
	
	private static void myPrintln(Object o) {
		System.out.println(o);
	}
	
}
class Box2<T1>{
	T1 t;
	public Box2(T1 t) {
		this.t=t;
	}
	public T1 getData() {
		return this.t;
	}
	
	
}
