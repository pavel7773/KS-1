package lesson_2

fun main() {
    var numberOfOrders: Int = 75
    val GladTo: String = "Благодарим вас,что выбрали нас.Ждем вас снова!"
    println("$numberOfOrders - заказов\n$GladTo")
    var storeStaff = 2000
    // println(storeStaff) -  к сожалению один наш сотрудник покинул нас
    storeStaff = 1999
    println(storeStaff)
}