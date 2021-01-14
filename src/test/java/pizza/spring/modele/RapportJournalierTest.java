package pizza.spring.modele;

import static org.junit.Assert.*;

import org.junit.Test;

public class RapportJournalierTest {
	
	private RapportJournalier rapportjournalier;
	private Categorie categorie;
	private long nbPizzas;
	private long montantEncaisse;

	@Test
	public void testGetCategorie() {
		assertEquals(this.categorie, this.rapportjournalier.getCategorie());
	}

	@Test
	public void testGetMontantEncaisse() {
		assertEquals(this.nbPizzas, this.rapportjournalier.getNbPizzas());
	}

	@Test
	public void testGetNbPizzas() {
		assertEquals(this.montantEncaisse, this.rapportjournalier.getMontantEncaisse());
	}

}
