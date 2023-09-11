interface Calci
{
	int Sum(int a,int b);
}
class Calciimp implements Calci
{
	public int Sum(int a,int b)
{
	return a+b;
}
}
class CalciDriver{
	public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	System.out.println("Enter 2 numbers to print sum");
	int n1 = s.nextInt();
	int n2 = s.nextInt();
	Calciimp i = new Calciimp();
	System.out.println(n1+"+"+n2+"="+i.Sum(n1,n2));
}
}