package assertions

import io.kotest.matchers.shouldBe
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class AssertionsTest {

    @Test
    fun `assertion with kotest`() {
        val result = adds()

        result shouldBe 3
    }

    @Test
    fun `assertion with junit`() {
        val result = adds()

        assertEquals(result, 3)
    }

    @Test
    fun `assertion with hamcrest`() {
        val result = adds()

        assertThat(result, equalTo(3))
    }

    @Test
    fun `assertion with kotlin`() {
        val result = adds()

        assert(result == 3)
    }

    private fun adds(): Int {
        val first = 1
        val second = 2
        return first + second
    }
}