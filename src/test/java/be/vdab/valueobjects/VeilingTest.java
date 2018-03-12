package be.vdab.valueobjects;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VeilingTest {
	private Veiling veiling;	
	
	@Before
	public void before() {
		veiling = new Veiling();
	}
	
	@Test
	public void het_hoogste_bod_is_nul_voor_het_eerste_bod() {
		assertEquals(0,veiling.getHoogsteBod());
	}
	
	@Test
	public void het_hoogste_bod_is_het_bedrag_van_het_eerste_bod() {
		veiling.doeBod(20);
		assertEquals(20,veiling.getHoogsteBod());
	}
	
	@Test
	public void het_hoogste_bod_is_het_hoogste_bedrag_bij_meerdere_biedingen() {
		veiling.doeBod(20);
		veiling.doeBod(40);
		veiling.doeBod(30);
		assertEquals(40,veiling.getHoogsteBod());
	}
}
