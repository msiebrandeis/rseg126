package the_sieve;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SieveTest {

	@Test
	public void testIsPrime() {

        assertEquals(false, Sieve.isPrime(77));

    }

}
