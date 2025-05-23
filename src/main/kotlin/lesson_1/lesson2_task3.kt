package lesson_2

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelTime = 457
    val totalMinutes = travelTime + departureMinute
    val arrivalHour = departureHour + totalMinutes / 60
    val arrivalMinute = totalMinutes % 60

    println("Время прибытия поезда $arrivalHour:${
        String.format("%02d", arrivalMinute)}")
}