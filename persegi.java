/**
 * 
 */
package tugasPBOfix;

/**
 * @author Lutfiyanra
 *
 */
public class persegi {
	
	double sisi;
	// Konstruktor Persegi
	persegi (int s){
		this.sisi = s;
	}
	
	// Fungsi luas Persegi
	void luas(){
		System.out.println("Luas Persegi adalah "+(4*this.sisi));
	}
	
	// Fungsi luas persegi (overloading)
	void luas (int s){
		/* overloading pada method luas persegi 
		 dengan menambahkan parameter double
		 */
		this.sisi = s;
		System.out.println("Overloading Luas Persegi adalah "+(4*this.sisi));
	}
	public static void main (String args[]){
		persegi B = new persegi(10);
		balok C = new balok(10);
		
		B.luas();
		C.luas();
		System.out.println("");
		//overloading
		B.luas(15);
		C.luas(15);
	}
}

class balok extends persegi{
	// Kontstruksi Balok
	balok(int s){
		super(s);
	}
	/* overriding fungsi luas pada class persegi
	 * menjadi fungsi luas permukaan balok
	 */
	 void luas(){
		 // overriding disini memodifikasi return value pada fungsi luas
		 System.out.println("Luas permukaan balok adalah "+(this.sisi*4));
	 }
	 // Fungsi luas permukaan balok secara overloading
	 void luas(int s){
		 // Overloading pada method luas dengan menambahkan parameter double
		 this.sisi = s;
		 System.out.println("Overloading Luas balok adalah "+(this.sisi*4));
	 }
}
