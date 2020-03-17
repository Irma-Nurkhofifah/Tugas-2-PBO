/*
	Nama  : Irma Nurkhofifah M.
	Stb   : 13020180096
	Kelas : B2
*/
public class Coba{
	int a; double b;

	//construktor defauld
	public Coba(){
	a = 100;
	b = 3.14;
	}
	//construktor parameter
	public Coba(int z){
	a = z;
	}

public static void main(String[] args){
	Coba cb1 = new Coba();
	Coba cb2 = new Coba(50);
	
	System.out.println(cb1.a);
	System.out.println(cb1.b);
	System.out.println(cb2.a);
	
}
}
