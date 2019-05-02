fun main(args: Array<String>) {
    ///////////////////////// BASIC DATA TYPE //////////////////
    val intNumber = 3
    val doubleNumber = 27.5
    val longNumber = 8L
    val floatNumber = 2.5F
    val hexaNumber = 0x0F
    val byteNumber = 0b010101

    println(intNumber)
    println(doubleNumber)
    println(longNumber)
    println(floatNumber)
    println(hexaNumber)
    println(byteNumber)
    println(doubleNumber.toInt())

    val stringNumber = "333"
    val intNumberFromString = stringNumber.toInt()

    /////////////////////////////// LOGICAL OPERATION //////////////
    val a = 3
    val b = 7
    val c = 5
    val x = a < b && b > c 
    val y = a > b && a < c 
    val z = a < b || a > c 
    println(z)

    //////////////////////// STRING ////////////////////////
    val singeLineString = "Hi, dicoding!"
    val multiLineString = """ Hi, dicoding!
                            ,
                            happy coding!
                            """
    val iterateString = singeLineString[0]
    println(iterateString)

    val queueNumber = 17
    val yourQueue = "Your queue number is $queueNumber"
    println(yourQueue)



    //////////////////////// ARRAY ///////////////////////
    val sampleArray = arrayOf(1,3,5)
    val mixArray = arrayOf(1,3,5, "odd", true)
    println(sampleArray[1])
    println(mixArray[4])

    val numbersArray = Array(4, {i -> i*3})

    val student = Student()
    student.studentName = "ikki"
    val name = student.studentName
    println(name)


    /////////////////// IF EXPRESSION /////////////////////////
    if (a > b) {
        print("a is greater than b")
    }
    else {
        print("a is not greater than b")
    }

    var result = if (a > b) a else b 
    println("\n")
    println(result)


    ////////////////// WHEN EXPRESSION //////////////////////
    val m = 4
    val whenExpressionTestRange = 0..4
    val whenExpressionTestArray = arrayOf(1,3,7,6)
    when (m) {
        1 -> print("m is 1")
        2 -> print("m is 2")
        in whenExpressionTestRange -> println("m is in range")
        !in whenExpressionTestArray -> println("m is not in array")
        else -> println("none of the above")
    }


    ////////////////////// FOR LOOPS //////////////////////
    for (number in 1..5){
        println(number)
    }

    /////////// using withIndex()
    val arrayNumbers = intArrayOf(1,3,5,7,9)
    for ((index, value) in arrayNumbers.withIndex()) {
        println("bilangan $value dengan indeks ke-$index \n")
    }

    /////////// using indices
    for (index in arrayNumbers.indices) {
        println("bilangan ${arrayNumbers[index]} dengan indeks ke-$index \n")
    }


    //////////////////// WHILE AND DO-WHILE LOOPS ////////////////////
    var n = 0
    while (n < 4) {
        println(n)
        n += 1
    }

    var l = 0
    do {
        println(l)
        l += 1
    } while (l < 3)

}

class Student {
    var studentName : String = ""
    get() = field.toUpperCase()
    set(value){
        field = "Name : $value"
    }
}