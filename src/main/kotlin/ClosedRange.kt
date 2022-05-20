class ClosedRange(private val lowerEndpoint: Int, private val upperEndPoint: Int) {

    override fun toString(): String {
        return "[$lowerEndpoint,$upperEndPoint]"
    }

    fun contains(number: Int): Boolean {
        return number in lowerEndpoint..upperEndPoint
    }
}