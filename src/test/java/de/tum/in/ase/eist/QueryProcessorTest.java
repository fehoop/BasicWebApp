package de.tum.in.ase.eist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class QueryProcessorTest {

	private final QueryProcessor queryProcessor = new QueryProcessor();

	@Test
	void testEmptyStringIfCannotProcessQuery() {
		assertEquals("", queryProcessor.process("fehoop"));
	}

	@Test
	void testKnowsAboutShakespeare() {
		String actual = queryProcessor.process("Shakespeare");
		if (!actual.contains("Shakespeare")) {
			fail("The QueryProcessor does not know about Shakespeare.");
		}
	}

	@Test
	void isNotCaseSensitive() {
		String actual = queryProcessor.process("shakespeare");
		if (!actual.contains("Shakespeare")) {
			fail("Your QueryProcessor should not be case sensitive.");
		}
	}

}
