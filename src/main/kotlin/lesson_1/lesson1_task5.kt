package lesson_5
const val SECONDS = 3600
const val PERSENT = 60
fun main() {
    val totalSeconds = 6480
    val hours = totalSeconds / SECONDS
    val minutes = (totalSeconds % SECONDS) /PERSENT
    val second = totalSeconds % PERSENT
    val formattedTime = String.format("%02d:%02d:%02d", hours, minutes, second)
    println(formattedTime)
}
