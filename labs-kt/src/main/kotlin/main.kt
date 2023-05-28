import kotlin.math.roundToInt

fun main() {

    print("insert the number of characters of the password : ")
    val numberOfletters = readLine()!!.toInt()

    val letters = "abcdfghijklmnopqrstuvwxyz"
    val lettersMayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val number = "0123456789"
    val simblos = "!@#$%^&*=+-/€<>)"

    var i = 1

    while (i <= numberOfletters) {

        val numberAleatoryForLetter = (Math.random() * 25).roundToInt()
        val numberAleatoryForNumbers = (Math.random() * 9).roundToInt()
        val numberAleatoryForSimbols = (Math.random() * 15).roundToInt()

        val j = i / 2
        val k = j * 2

        if ( i <= 6 ) {
            if ( i == k || i == 1) {
                print(letters[numberAleatoryForLetter])
            }else if ( i != k ) {
                print(number[numberAleatoryForNumbers])
            }
        }else if ( i >= 7 ) {
            if ( i == k ) {
                print(simblos[numberAleatoryForSimbols])
            }else if ( i != k ) {
                print(lettersMayus[numberAleatoryForLetter])
            }
        }
        i++
    }
}
