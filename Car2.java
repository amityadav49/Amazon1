class Car2
{
	int id;
	String name;
	double sal;

	Car2()
	{
		
	}
	Car2(int id)
	{
		this.id=id;
	}
	Car2(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	Car2(int id , String name, double sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	public static void main(String[] args)
	{
		Car2 ref = new Car2(10);
		System.out.println("Emp id "+ref.id);
		System.out.println("Emp name "+ref.name);
		System.out.println("Emp salary "+ref.sal);
		System.out.println("============================");
		Car2 ref1 = new Car2(12,"Amit");
		System.out.println("Emp id "+ref1.id);
		System.out.println("Emp name "+ref1.name);
		System.out.println("Emp salary "+ref1.sal);
		System.out.println("============================");
		Car2 ref2 = new Car2(14,"Sam",55000);
		System.out.println("Emp id "+ref2.id);
		System.out.println("Emp name "+ref2.name);
		System.out.println("Emp salary "+ref2.sal);
		System.out.println("============================");
		Car2 ref3 = new Car2();
		System.out.println("Emp id "+ref3.id);
		System.out.println("Emp name "+ref3.name);
		System.out.println("Emp salary "+ref3.sal);
	}
}