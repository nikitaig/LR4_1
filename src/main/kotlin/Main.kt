import java.util.*
fun main() {
    println("Выберите вариант:0-камень, 1 - ножницы, 2-бумага")
    val userChoice = readlnOrNull()?.toIntOrNull();

    if (userChoice == null || userChoice < 0 || userChoice > 2) {
        println("Некорректный выбор! Попробуйте еще раз.")
        return
    }
    val computerChoice = (0..2).random()
    println("Ваш выбор: ${getOptionName(userChoice)}")
    println("Ваш компьютера: ${getOptionName(computerChoice)}")

    when {
        userChoice == computerChoice -> println("Ничья!")
        (userChoice == 0 && computerChoice == 1) || (userChoice == 1 && computerChoice == 2) ||
                (userChoice == 2 && computerChoice == 0) -> println("Поздравляю, вы победили!")
        else -> println("Компьютер победил!")
    }
}
fun getOptionName(option:Int): String {
    return when (option){
        0 ->"Камень"
        1-> "Ножницы"
        else ->"Бумага"
    }
}