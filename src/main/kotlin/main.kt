fun main(args: Array<String>) {
    println("Hello World!")

    var name = "inkkk"
    var name2 = "ikkk"

    // check if null
    var text = ""
    text?.let {
        val length = text.length
    }
    // or
    val length = text?.length

    var ikan = "Ikan"
    var inka = "Inka"
    var message = "Ini fussion: %ik %in"

    // string formatting
    val textString = """
        | First Line
        | Second Line
        | Third Line
        """.trimMargin()

    // ternary operation
    var x = 5
    var ternaryTest = if (x>5) {
                        println("x > 5")
                        }
                        else{
                        println("x <= 5")
                        }    
    var messageTernary: String? = null
    println(messageTernary ?: "")

    // logical operator
    // var andOperator = a and b
    // var orOperator = a or b
    // var xorOperator = a xor b
    // var rightShiftOperator = a shr 2
    // var leftShiftOperator = a shl 2
    // var unsignedRightShiftOperator = a ushr 2

}