
class Factorial { /* This program consists of a single class with two methods */
	public static void main (String args[])
	{
		long i, f;
		long lower = 0, upper = 20;
		for (i=0; i<upper;  i++) {
			f = factorial(i);
			System.out.println(i + " " +f);
		}
	}

	static long factorial (long k)
	{
		if (k == 0)
			return 1;
		else
			return (k * factorial(k-1));
	}
}

