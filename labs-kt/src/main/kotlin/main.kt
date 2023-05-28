fun main() {

    var NumberOfletters = readLine()!!.toInt()

    var letters = "abcdfghijklmnopqrstuvwxyz"
    var LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    var number = "0123456789"
    var simblos = "!@#$%^&*=+-/€<>)"

    var i = 1

    while (i <= NumberOfletters) {

        val NumberAleatoryForLetter = Math.round(Math.random() * 25)
        val NumberAleatoryForNumbers = Math.round(Math.random() * 9)
        val NumberAleatoryForSimbols = Math.round(Math.random() * 15)

        var j = i / 2
        var k = j * 2

        if ( i <= 6 ) {
            if ( i == k || i == 1) {
                print(letters[NumberAleatoryForLetter.toInt()])
            }else if ( i != k ) {
                print(number[NumberAleatoryForNumbers.toInt()])
            }
        }else if ( i >= 7 ) {
            if ( i == k ) {
                print(simblos[NumberAleatoryForSimbols.toInt()])
            }else if ( i != k ) {
                print(LETTERS[NumberAleatoryForLetter.toInt()])
            }
        }
        i++
    }
}