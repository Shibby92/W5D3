public class Datum {

	private int dan;
	private int mjesec;
	private int godina;

	/**
	 * Prima tip Datum kao parametar i i postavlja ih respektivno
	 * 
	 * @param other
	 *            datum iz kojeg se vade atributi
	 */
	public Datum(Datum other) {
		this.dan = other.dan;
		this.mjesec = other.mjesec;
		this.godina = other.godina;
	}

	/**
	 * postavlja parametre na: dan=1, mjesec=1,godina=1990
	 */
	public Datum() {
		this.dan = 1;
		this.mjesec = 1;
		this.godina = 1900;
	}

	/**
	 * Prima parametre za datum i postavlja ih
	 * 
	 * @param postaviDan
	 *            Vrijednost dana koji se postavlja
	 * @param postaviMjesec
	 *            Vrijednost mjeseca koji se postavlja
	 * @param postaviGodina
	 *            Vrijednost godine koja se postavlja
	 */
	public Datum(int postaviDan, int postaviMjesec, int postaviGodina) {
		this.dan = postaviDan;
		this.mjesec = postaviMjesec;
		this.godina = postaviGodina;
	}

	/**
	 * Ispisuje datum
	 */
	public String toString() {
		String datumKaoString = "";
		datumKaoString = dan + "." + mjesec + "." + godina;
		return datumKaoString;
	}

	/**
	 * Vraca dan zeljenog datuma
	 * 
	 * @return Dan
	 */
	public int getDan() {
		return dan;
	}

	/**
	 * Vraca mjesec zeljenog datuma
	 * 
	 * @return Mjesec
	 */
	public int getMjesec() {
		return mjesec;
	}

	/**
	 * Vraca godinu zeljenog datuma
	 * 
	 * @return Godinu
	 */
	public int getGodina() {
		return godina;
	}

	/**
	 * Postavlja novu vrijednost dana
	 * 
	 * @param dan
	 *            Nova vrijednost dana
	 * @return True/false ovisno da li je dan u regularnom dometu
	 */
	public boolean setDan(int dan) {
		if (dan < 0 || dan > 31) {
			return false;
		} else {
			this.dan = dan;
			return true;
		}
	}

	/**
	 * Postavlja novu vrijednost mjeseca
	 * 
	 * @param mjesec
	 *            Nova vrijednost mjeseca
	 * @return True/false ovisno da li je mjesec u regularnom dometu
	 */

	public boolean setMjesec(int mjesec) {
		if (mjesec < 0 || mjesec > 12) {
			return false;
		} else {
			this.mjesec = mjesec;
			return true;
		}

	}

	/**
	 * Postavlja novu vrijednost godine
	 * 
	 * @param godina
	 *            Nova vrijednost godine
	 * @return True/false ovisno da li je godina u regularnomm dometu
	 */
	public boolean setGodina(int godina) {
		if (godina < 1900 || godina > 3400) {
			return false;
		} else {
			this.godina = godina;
			return true;

		}
	}

	public boolean equals(Datum other) {
		if ((this.dan == other.dan) && (this.mjesec == other.mjesec)
				&& (this.godina == other.godina))
			return true;
		else
			return false;
	}
/**
 * Poredi koji je datum veci od drugog
 * @param other Datum koji se poredi
 * @return -1 ako je datum manje, 0 ako su isti, 1 ako je datum veci
 */
	public int compare(Datum other) {
		if (this.godina < other.godina)
			return -1;
		else if (this.godina > other.godina)
			return 1;
		else {
			if (this.mjesec < other.mjesec)
				return -1;
			else if (this.mjesec > other.mjesec)
				return 1;
			else {
				if (this.dan < other.dan)
					return -1;
				else if (this.dan > other.dan)
					return 1;
				else
					return 0;
			}
		}
	}

}