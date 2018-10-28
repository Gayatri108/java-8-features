package com.core.java;

/**
 * Hello world!
 *
 */
interface I
{
	default void show()
	{
		System.out.println("I");
	}
	static void print()
	{
		System.out.println("Print() method of interface I");
	}
}
interface J
{
	default void show()
	{
		System.out.println("J");
	}
}
class A implements I,J
{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		I.super.show();
		J.super.show();
		System.out.println("A");
	}
	
}
public class MethodsInInterface 
{
    public static void main( String[] args )
    {
       new A().show();
       I.print();
    }
}
