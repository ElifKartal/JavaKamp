package intro;

public class Main {

	public static void main(String[] args) {
		
		String internetSubeButonu="�nternet �ubeye gir";
		double dolarDun = 8.20;
		double dolarBugun=8.20;
		int vade =36;
		boolean dustuMu=false;
		
		System.out.println(internetSubeButonu);
		System.out.println("------------------");
		
		
		if(dolarBugun<dolarDun) {
			
			System.out.println("Dolar d��t� resmi");
			
		}else if(dolarBugun>dolarDun) {
			System.out.println("Dolar y�kseldi resmi");
			
		}else{
			System.out.println("Dolar e�ittir resmi");
		}
	
		System.out.println("------------------");
		String kredi1="H�zl� Kredi";
		String kredi2="Mutlu Emekli Kredi";
		String kredi3="Konut Kredi";
		String kredi4="�ift�i Kredi";
		String kredi5="Msb Kredi";
	
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println("-----------------");
		
		
		String[] krediler = 
			{
				"H�zl� Kredi",
				"Mutlu Emekli Kredi",
				"Konut Kredi",
				"�ift�i Kredi",
				"Msb Kredi"
			};   
		//foreach
		for(String kredi:krediler) {
			System.out.println(kredi);
			
		}
		//i++ = i=�+1 ikisi ayn�d�r.bir bir art�r
		//i-- bir bir azalt.
		System.out.println("-----------------");
		for(int i=0;i<krediler.length;i++) {
			System.out.println(krediler[i]);
			
		}
		
		
		
  }	
  
}


















