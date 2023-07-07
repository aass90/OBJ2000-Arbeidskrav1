package aass.Oblig1;

import java.util.ArrayList;
import java.util.Random;

public class DiktKontroll_aass {
	// Random for å bytte litt på rekkefølge av ord fra bruker
	Random rand = new Random();
	
	public String enkelListe() {
		// Oppretter en ArrayList for å dynamisk endre på størrelsen av diktet
		ArrayList<String> enkelListe = getEnkeltOrd();
		
		// min og max for å benytte Random
		int min = 1;
		int max = enkelListe.size();
		
		String EnkelString = "";
		// Ytre For- løkke for å tilordne at diktet har 4 ord på hver linje
		for (int i = 0; i < 4; i ++) {
			// Indre løkke
			for (int j = 0; j < 4; j ++) {
				EnkelString += j == 0 ? "" : " ";
				int randNr = rand.nextInt((max - min)+1);
				EnkelString += enkelListe.get(randNr);
			}
			// Slutt på indre løkke
			// Legger inn linjeskift på Stringen
			EnkelString += "\n";
		}
		// Slutt på ytre løkke
		// Returnerer Stringen
		return EnkelString;
	}
	// Oppretter ArrayList for ord som kommer fra bruker som igjen snakker med Grensesnittet
	private ArrayList<String> enkeltOrd = new ArrayList<String>();
	
	public ArrayList<String> getEnkeltOrd() {
		return enkeltOrd;
	}
	
	// Legger her til en ordliste som ord fra bruker legges i
	public void leggTilOrdliste(String value) {
		enkeltOrd.add(value);
	}
	
	// Videre arbeid med avansert dikt kommer her

}
