public class Kasus1{
	String stb, nama, jurusan, fakultas;
	
	public Kasus1()
	{	
		stb ="13020180096";
		nama ="Irma Nurkhofifah M.";
		jurusan ="Teknik Informatika";
		fakultas ="Ilmu komputer";
	}
	
	public static void main(String[] args)
	{
		Kasus1 bio = new Kasus1();
		
		System.out.println("Nim      : " +(bio.stb));
		System.out.println("Nama     : " +(bio.nama));
		System.out.println("Jurusan  : " +(bio.jurusan));
		System.out.println("Fakultas : " +(bio.fakultas));
	}

}