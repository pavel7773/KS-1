package lesson_5
const val TOTAL_SECONDS = 6480
const val SECONDS = 3600
const val PERSENT = 60
fun main() {

    val hours = TOTAL_SECONDS / SECONDS
    val minutes = (TOTAL_SECONDS % SECONDS) /PERSENT
    val second = TOTAL_SECONDS % PERSENT
    val formattedTime = String.format("%02d:%02d:%02d", hours, minutes, second)
    println(formattedTime)
}
