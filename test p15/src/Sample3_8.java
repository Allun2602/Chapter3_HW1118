
public class Sample3_8 {

	public static void main(String[] args) {
		Car car1;
		car1=new Car();
		
		int number=1234;
		double gasonline=20.5;
		car1.setnumgas(number,gasonline);

	}

}
class Car
{
	int num;
	double gas;
	
	void setnumgas(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("�N�����]��"+num+",�T�o�q�]��"+gas);
	
	}
	void show()
	{
	System.out.println("�����O"+num);
	System.out.println("�T�o�q�O"+gas);
	}
	
}