package pl.pwujakow.tempus.utils;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;

import org.junit.Test;

public abstract class EqualsUnitTest {
	
	@Test
	public void equalsContract() {
		EqualsVerifier.forClass(getTestedClazz()).suppress(Warning.NONFINAL_FIELDS).verify();
	}

	public abstract Class<?> getTestedClazz();

}
