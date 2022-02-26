fun main() {

    val commission = 0.0075
    val maxCommission = 3500
    val amount = 188875
    val result = amount*commission
    if (result < maxCommission) {
        println("Комиссия равна " + result / 100 + " рублей")
    } else {
        println("Комиссия равна 35 рублей")
    }

}