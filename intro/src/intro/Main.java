package intro;

public class Main {

	public static void main(String[] args) {
		
		String internetSubeButonu="Ýnternet Þubeye gir";
		double dolarDun = 8.20;
		double dolarBugun=8.20;
		int vade =36;
		boolean dustuMu=false;
		
		System.out.println(internetSubeButonu);
		System.out.println("------------------");
		
		
		if(dolarBugun<dolarDun) {
			
			System.out.println("Dolar düþtü resmi");
			
		}else if(dolarBugun>dolarDun) {
			System.out.println("Dolar yükseldi resmi");
			
		}else{
			System.out.println("Dolar eþittir resmi");
		}
	
		System.out.println("------------------");
		String kredi1="Hýzlý Kredi";
		String kredi2="Mutlu Emekli Kredi";
		String kredi3="Konut Kredi";
		String kredi4="Çiftçi Kredi";
		String kredi5="Msb Kredi";
	
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println("-----------------");
		
		
		String[] krediler = 
			{
				"Hýzlý Kredi",
				"Mutlu Emekli Kredi",
				"Konut Kredi",
				"Çiftçi Kredi",
				"Msb Kredi"
			};   
		//foreach
		for(String kredi:krediler) {
			System.out.println(kredi);
			
		}
		//i++ = i=Ý+1 ikisi aynýdýr.bir bir artýr
		//i-- bir bir azalt.
		System.out.println("-----------------");
		for(int i=0;i<krediler.length;i++) {
			System.out.println(krediler[i]);
			
		}
		
		
		
  }	
  
}


















