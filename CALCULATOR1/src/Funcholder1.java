public class Funcholder1 {
	private static Funcholder1 opreal=new Funcholder1();
	public static Funcholder1 getinst()
	{
		return opreal;
	}
	public float add(float a,float b)
	{
		return a+b;
	}
	public float sub(float a,float b)
	{
		return a-b;
	}
	public float mul(float a,float b)
	{
		return a*b;
	}
	public float div(float a,float b)
	{
		return a/b;
	}
	public float sqr(float a)
	{
		return a*a;
	}

}
