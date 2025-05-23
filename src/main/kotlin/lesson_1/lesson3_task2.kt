package lesson_3

fun main() {
    var surname = "Андреева"
    val name = "Татьяна"
    val patronymic = "Сергеевна"
    val age1 = 20
    val fullNameAt20 = "$surname $name $patronymic"
    surname = "Сидорова"
    val age2 = 22
    val fullNameAt22 = "$surname $name $patronymic"
    println("Персональные данные до замужества: [$fullNameAt20, $age1]")
    println("Персональные данные после замужества: [$fullNameAt22, $age2]")
}