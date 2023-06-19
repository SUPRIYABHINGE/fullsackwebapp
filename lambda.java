package assign1;
interface add{
	public int add(int n1,int n2);
}
interface sub{
	public int sub(int n1,int n2);
}
interface mul{
	public int mul(int n1,int n2);
}
interface div
{
	public int div(int n1,int n2);
}
interface mod{
	public int mod(int n1,int n2);
}
public class lambda {

	public static void main(String[] args) {
		add a1=(v1,v2)->{return v1+v2;};
		System.out.println("addition="+a1.add(2, 4));
		sub a2=(v1,v2)->{return v1-v2;};
		System.out.println("substraction="+a2.sub(6,2));
		mul a3=(v1,v2)->{return v1*v2;};
		System.out.println("Multipliaction="+a3.mul(6,2));
		div a4=(v1,v2)->{return v1/v2;};
		System.out.println("Division="+a4.div(6,2));


	}

}
