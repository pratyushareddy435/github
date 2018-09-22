public class TestCircle
{
	public static void main(String args[ ])
	{
		Circle obj=new Circle();
		System.out.println(obj.getRadius());
		System.out.println(obj.getArea());
		Circle obj1=new Circle(4.5);
		System.out.println(obj1.getRadius());
		System.out.println(obj1.getArea());
	}
}
