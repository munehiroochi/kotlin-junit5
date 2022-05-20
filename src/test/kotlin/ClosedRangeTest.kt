import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class ClosedRangeTest {

    @DisplayName("閉区間 [3,8] の文字列表記は [3,8]である")
    @Test
    fun `閉区間3,8の文字列表記は3,8`() {
        val c = ClosedRange(3,8)
        assertEquals("[3,8]", c.toString())
    }

    @ParameterizedTest(name = "閉区間[3,8]は{0}を含む")
    @ValueSource(ints = [3, 4, 5, 6, 7, 8])
    fun `閉区間3,8は3, 4, 5, 6, 7, 8を含む`(n: Int) {
        val c = ClosedRange(3, 8)
        assertEquals(true, c.contains(n))
    }

    @ParameterizedTest(name = "閉区間[3,8]は{0}を含まない")
    @ValueSource(ints = [-1, 2, 9])
    fun `閉区間3,8は−1, 2, 9を含まない`(n: Int) {
        val c = ClosedRange(3, 8)
        assertEquals(false, c.contains(n))
    }

    @Test
    fun `下端点が上端点より大きい場合は例外を返す`() {
        // これから書く
    }
}