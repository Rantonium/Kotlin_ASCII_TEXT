package signature
import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)

    val name = reader.nextLine()
    //val status = reader.nextLine()

    val letterTop  = listOf("____", "___ ", "____", "___ ",  "____", "____", "____", "_  _", "_", " _", "_  _", "_   ", "_  _" , "_  _" , "____", "___ ", "____" , "____" , "____", "___", "_  _", "_  _" ,"_ _ _", "_  _" ,"_   _"  ,"___ ")
    val letterMid  = listOf("|__|", "|__]", "|   ", "|  \\", "|___", "|___", "| __", "|__|", "|", " |", "|_/ ", "|   ", "|\\/|", "|\\ |", "|  |", "|__]", "|  |" , "|__/" , "[__ ", " | ", "|  |", "|  |" ,"| | |", " \\/ ", " \\_/ ","  / ")
    val letterBot  = listOf("|  |", "|__]", "|___", "|__/",  "|___", "|   ", "|__]", "|  |", "|", "_|", "| \\_","|___", "|  |" , "| \\|", "|__|", "|   ", "|_\\|", "|  \\", "___]", " | ", "|__|", " \\/ ","|_|_|", "_/\\_", "  |  " ," /__")

    var length = 3

    for (l in name){
        length += if(l==' ') 4
        else
            letterTop[(l - 97).toInt()].length + 1
    }

    repeat(length){
        print("*")
    }
    print("\n")

    for(j in 0..2) {
        print("* ")
        for(i in name.indices){
            if(name[i]==' ') {
                print("    ")
            }
            else {
                when (j) {
                    0 -> print(letterTop[(name[i] - 97).toInt()] + " ")
                    1 -> print(letterMid[(name[i] - 97).toInt()] + " ")
                    2 -> print(letterBot[(name[i] - 97).toInt()] + " ")
                }
            }
            if(i==name.length-1)
                print("*\n")
        }
    }

    repeat(length){
        print("*")
    }
}
