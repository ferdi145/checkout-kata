package kata.checkout

class Checkout{
    private var item: Items = Items()

    fun scan(item: Item) {
        this.item = item
    }

    fun total(): Price? {
        return item?.price
    }

}
