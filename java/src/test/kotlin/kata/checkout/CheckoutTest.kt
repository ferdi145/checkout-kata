package kata.checkout

import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test

class CheckoutTest {

    @Test
    fun createCheckout() {
        val checkout = Checkout()
        val item = Item(ItemName("test"), Price(10))
        checkout.scan(item)

        assertThat(checkout.total()).isEqualTo(10)
    }
}
