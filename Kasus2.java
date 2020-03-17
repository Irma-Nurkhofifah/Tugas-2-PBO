/*
	Nama  : Irma Nurkhofifah M.
	Stb   : 13020180096
	Kelas : B2
*/

public class Kasus2{
	int ttlDetik, detikSkrng, ttlMenit, menitSkrng, ttlJam, jamSkrng;
	
	public Kasus2(){
		ttlDetik = 1203183086;
		detikSkrng = ttlDetik%60;
		ttlMenit = ttlDetik/60;
		menitSkrng = ttlMenit%60;
		ttlJam = ttlMenit/60;
		jamSkrng = ttlJam%24;
	}

public static void main(String[] args)
	{
	Kasus2 time = new Kasus2();
	System.out.println("Konversi waktu dari "+(time.ttlDetik)+" detik =");
	System.out.println((time.jamSkrng)+" JAM : "+(time.menitSkrng)+" MENIT : "+(time.detikSkrng)+" DETIK");
}
}