package aass.Oblig1;

import javax.swing.JOptionPane;

public class Grensesnitt_aass {
	
	// Lager et objekt av DiktKontroll
	DiktKontroll_aass diktkontroll = new DiktKontroll_aass();
	
	// Viser hvilke valg bruker får opp i Hovedmenyen
	private String[] ALTERNATIVER = {"Enkelt Dikt", "Avansert Dikt", "Avslutt"};
	
	// Oppretter  private klasser for grensesnittet som igjen snakker med de forskjellige menyvalgene
	// Oppsettet er inspirert fra en oppgave som ligger under "filer" i Canvas ("DyreGUI")
	private final int EDIKT = 0;
	private final int ADIKT = 1;
	private final int AVSLUTT = 2;
	
	private final int REGORD = 0;
	private final int SDIKT = 1;
	private final int HOVEDMENY = 2;
	
	private final int REGAORD = 0;
	private final int SADIKT = 1;
	private final int HOVEDMENYA = 2;
	
	private String enkeltOrd;
	
	// Oppretter meny med valg
	public void meny() {
		// Bolsk variabel med løkke for å styre gangen i menyen
		boolean fortsett = true;
		while (fortsett) {
			int valg = lesValg();
			
			// Bruker Case for å behandle valg
			switch (valg) {
			case EDIKT : enkeltDikt();
				break;
			case SDIKT : skrivDikt();
				break;
			default : fortsett = false;
			}
		}
	}
	
	public int lesValg() {
		int valg = JOptionPane.showOptionDialog(null, "Dine valg", "Dikt- Generator", JOptionPane.DEFAULT_OPTION,
		JOptionPane.PLAIN_MESSAGE, null, ALTERNATIVER, ALTERNATIVER[0]);
		return valg;
	}
	
	private String[] ENKELALTERNATIVER = {"Registrer ord", "Skrive dikt", "Tilbake"};
	
	public void enkeltDikt() {
		boolean fortsett = true;
		while (fortsett) {
			int enkeltValg = lesEnkeltValg();
			switch (enkeltValg) {
			case REGORD : regOrd();
				break;
			case SDIKT : skrivDikt();
			default : fortsett = false;
			}
		}
	}
	
	public int lesEnkeltValg() {
		int enkeltValg = JOptionPane.showOptionDialog(null, "Dine valg", "Enkelt Dikt", JOptionPane.DEFAULT_OPTION,
		JOptionPane.PLAIN_MESSAGE, null, ENKELALTERNATIVER, ENKELALTERNATIVER[0]);
		return enkeltValg;
	}
	
	private String[] AVANSERTALTERNATIVER = {"Registrer ord", "Skrive dikt", "Tilbake"};
	
	public void avansertDikt() {
		boolean fortsett = true;
		while (fortsett) {
			int avansertValg = lesAvansertValg();
			switch (avansertValg) {
			// Her kommer registrering av dikt for videre arbeid
			case REGAORD : regAvansertOrd();
				break;
			// Her kommer visning av avansert dikt for videre arbeid
			case SADIKT : skrivAvansertDikt();
				break;
			default : fortsett = false;
			}
		}
	}
	
	public int lesAvansertValg() {
		int avansertValg = JOptionPane.showOptionDialog(null, "Dine valg", "Avansert Dikt", JOptionPane.DEFAULT_OPTION,
		JOptionPane.PLAIN_MESSAGE, null, AVANSERTALTERNATIVER, AVANSERTALTERNATIVER[0]);
		return avansertValg;
	}
	public void regOrd() {
		enkeltOrd = JOptionPane.showInputDialog(null, "Angi ønsket ord (Gjenta for flere ord): ");
		// Kaller metoden enkelListe() i DiktKontroll som igjen legger input fra bruker i enkeltOrd()
		diktkontroll.leggTilOrdliste(enkeltOrd);
		enkeltDikt();
	}
	
	public void skrivDikt() {
		// Viser dikt med ord fra bruker
			JOptionPane.showMessageDialog(null, diktkontroll.enkelListe());
		}
		
	public void regAvansertOrd() {
		// Registrer ord
	}
	
	public void skrivAvansertDikt() {
		// Generer dikt
	}
		
} // Videre arbeid med avansert dikt kommer her




