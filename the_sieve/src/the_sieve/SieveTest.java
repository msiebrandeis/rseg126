package the_sieve;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SieveTest {

	@Test
	public void testIsPrime() {

        assertEquals(false, Sieve.isPrime(77));

    }

}
