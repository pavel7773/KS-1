package lesson_1

fun main() {
    // Kоличество сотрудников и их зарплата
    val workers = 50
    val salaryOfEmployees = 30000
    // Kоличество стажеров и их зарплата
    val interns = 30
    val salaryOfInterns = 20000
    // Расходы на выплату зарплаты постоянных сотрудников
    val employeeExpenses = workers * salaryOfEmployees
    // Общие расходы по ЗП после прихода стажеров
    val generalExpenses = employeeExpenses + (interns * salaryOfInterns)
    // Средняя ЗП одного сотрудника после устройства стажеров.
    val totalEmployees  =  workers + interns
    val averageSalary = generalExpenses /  totalEmployees
    println("Расходы на выплату зарплаты постоянных сотрудников:$employeeExpenses")
    println("Общие расходы по ЗП после прихода стажеров:$generalExpenses")
    println("Средняя ЗП одного сотрудника после устройства стажеров:$averageSalary")
}