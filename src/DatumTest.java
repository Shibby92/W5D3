public class DatumTest {

	public static void main(String[] args) {
		Datum prviDatum = new Datum(10, 12, 2014);
		Datum drugiDatum = new Datum();
		System.out.println(prviDatum.toString());
		System.out.println(prviDatum.getDan());
		System.out.println(prviDatum.getMjesec());
		System.out.println(prviDatum.getGodina());
		prviDatum.setDan(25);
		System.out.println(prviDatum.getDan());
		Datum treciDatum = new Datum(prviDatum);
		prviDatum.setDan(31);
		System.out.println(prviDatum.getDan());
		System.out.println(treciDatum.getDan());
		if(prviDatum.equals(treciDatum))
			System.out.println("Jednaki");
		else
			System.out.println("Nejednaki");
		System.out.println(prviDatum.compare(treciDatum));
	}

}
