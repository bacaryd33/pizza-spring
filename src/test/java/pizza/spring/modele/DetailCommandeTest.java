package pizza.spring.modele;

import static org.junit.Assert.*;

import org.junit.Test;

public class DetailCommandeTest {
	
	private DetailCommande detailCommande;
	private Long id;
	private Commande commande;
	private Pizza pizza;

	@Test
	public void testGetId() {
		assertEquals(this.id, this.detailCommande.getId());
	}

	@Test
	public void testGetCommande() {
		assertEquals(this.commande, this.detailCommande.getCommande());
	}

	@Test
	public void testGetPizza() {
		assertEquals(this.pizza, this.detailCommande.getPizza());
	}

}
