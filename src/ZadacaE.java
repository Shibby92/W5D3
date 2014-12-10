
public class ZadacaE {

	public static void main(String[] args) {
		Datum [] datumi= new Datum [50];
		generisiDatume(datumi);
		bubbleSort(datumi);
		ispisiDatume(datumi);

	}

	private static void ispisiDatume(Datum[] datumi) {
		for(int i =0;i<datumi.length;i++){
			System.out.println(datumi[i].toString());
		}
		
	}

	private static void generisiDatume(Datum[] datumi) {
		for(int i =0;i<datumi.length;i++){
			datumi[i]= new Datum();
			datumi[i].setGodina(2014);
		}
		
	}
	
		
		public static void bubbleSort(Datum [] datumi){
			Datum temp= new Datum();
			for(int i=0;i<datumi.length-1;i++){
				for(int j=i+1;j<datumi.length;j++){
					if(datumi[i].compare(datumi[j])==1){
						temp=datumi[j];
					datumi[j]=datumi[i];
					datumi[i]=temp;
					}
				}
			}
		}
		
	

}
