package lesson_5

fun main() {
    val totalSeconds = 6480
    val hours = totalSeconds / 3600
    val minutes = (totalSeconds % 3600) /60
    val second = totalSeconds % 60
    val formattedTime = String.format("%02d:%02d:%02d", hours, minutes, second)
    println(formattedTime)
}