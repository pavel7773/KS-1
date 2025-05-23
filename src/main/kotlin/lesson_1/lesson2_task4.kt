package lesson_2

fun main() {
    val baff = 0.20
    val сrystal = 7
    val ore = 11
    val bonusCrystal = (baff * сrystal).toInt()
    val bonusOre = (baff * ore).toInt()
    println("Бонусные кристалы: $bonusCrystal\nБонусная железная руда: $bonusOre")
}