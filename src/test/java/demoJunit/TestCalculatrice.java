package demoJunit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculatrice {

	@Test
	public void testSomme() {
		assertTrue(Calculatrice.somme(2, 3)==5);
	}
	
	@Test
	public void testProduit() {
		assertTrue(Calculatrice.produit(2, 3)==6);
	}
	
	@Test
	public void testSoustract() {
		assertTrue(Calculatrice.soustraction(4, 3)==1);
	}


}
