package kata.checkout

import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test

class CheckoutTest {

    @Test
    fun `calculate price of one item`() {
        val checkout = Checkout()
        val item = Item(ItemName("test"), Price(10))

        checkout.scan(item)

        assertThat(checkout.total()).isEqualTo(Price(10))
    }

    @Test
    fun `calculate price of multiple items`() {
        val checkout = Checkout()
        val item = Item(ItemName("test"), Price(10))

        checkout.scan(item)
        checkout.scan(item)

        assertThat(checkout.total()).isEqualTo(Price(20))
    }
}
