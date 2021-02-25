package kata.checkout

import org.junit.Test
import kotlin.test.assertEquals

class ItemTest {
    @Test
    fun createItem() {
        val name = "name"
        val itemName = ItemName(name)
        val item = Item(itemName, Price(10))

        assertEquals(itemName, item.itemName)
    }
}