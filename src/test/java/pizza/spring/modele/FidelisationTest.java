package pizza.spring.modele;

import static org.junit.Assert.*;

import org.junit.Test;

public class FidelisationTest {
	
	private Fidelisation fidelisation;
	private String nomClient;
	private long nbCommandes;


	@Test
	public void testGetNomClient() {
		assertEquals(this.nomClient, this.fidelisation.getNomClient());
	}

	@Test
	public void testGetNbCommandes() {
		assertEquals(this.nbCommandes, this.fidelisation.getNbCommandes());
	}

}
