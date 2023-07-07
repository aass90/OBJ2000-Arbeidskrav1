package aass.Oblig1;

import java.util.ArrayList;
import java.util.Random;

public class DiktKontroll_aass {
	// Random for � bytte litt p� rekkef�lge av ord fra bruker
	Random rand = new Random();
	
	public String enkelListe() {
		// Oppretter en ArrayList for � dynamisk endre p� st�rrelsen av diktet
		ArrayList<String> enkelListe = getEnkeltOrd();
		
		// min og max for � benytte Random
		int min = 1;
		int max = enkelListe.size();
		
		String EnkelString = "";
		// Ytre For- l�kke for � tilordne at diktet har 4 ord p� hver linje
		for (int i = 0; i < 4; i ++) {
			// Indre l�kke
			for (int j = 0; j < 4; j ++) {
				EnkelString += j == 0 ? "" : " ";
				int randNr = rand.nextInt((max - min)+1);
				EnkelString += enkelListe.get(randNr);
			}
			// Slutt p� indre l�kke
			// Legger inn linjeskift p� Stringen
			EnkelString += "\n";
		}
		// Slutt p� ytre l�kke
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
