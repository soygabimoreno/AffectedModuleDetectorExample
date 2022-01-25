package soy.gabimoreno.feature1

import org.junit.Assert.assertTrue
import org.junit.Test

class IntegerParserTest {

    val integerParser = IntegerParser()

    @Test
    fun `GIVEN a number WHEN IntegerParser is invoked THEN return the proper string`() {
        val number = 2
        val result = integerParser(number)

        assertTrue("2" == result)
    }
}
