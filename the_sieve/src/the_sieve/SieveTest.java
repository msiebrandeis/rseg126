package the_sieve;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class SieveTest {

	@Test
	public void testIsPrime() {

        assertEquals(true, Sieve.isPrime(77));

    }

}
