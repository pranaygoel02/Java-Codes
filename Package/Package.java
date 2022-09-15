import Package1.*;
import Package1.Package2.C;
class Package{
	public static void main(String... ar){
		A ob = new A();
		ob.display();
		C obj = new C();
		obj.display();
	}
}