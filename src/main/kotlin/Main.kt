package org.example

import java.util.Arrays

fun main() {
    println("Лабороторная работа №4")
    println("<==============================>")
    println("Задание №1")
    LabFourTaskOne(8, 5)
    LabFourTaskOne(8,8)
    LabFourTaskOne(3, 6)
    println("<==============================>")
    println("Задание №2")
    LabFourTaskTwo()
    println("<==============================>")
    println("Задание №3")
    LabFourTaskThree()
    println("<==============================>")
    println("Задание №4")
    LabFourTaskFour()
    println("<==============================>")
    println("Задание №5")
    LabFourTaskFive()
//    Исходный Массив: [24, -63, 67, -12, 88, 94, -28, 82, 0, 53]
    println("<==============================>")
    println("Задание №6")
    LabFourTaskSix()
    println("Лабороторная работа №5")
    println("<==============================>")
    println("Задание №1")
    var numTest: Int = 1272
    println(LabFiveTaskOne(numTest))
    var numTwoTest: Int = 999
    println(LabFiveTaskOne(numTwoTest))
    println("<==============================>")
    println("Задание №2")
    LabFiveTaskTwo(253)
}


fun LabFourTaskOne(numOne: Int, numTwo:Int){
    print("Введенные числа: $numOne и $numTwo")
    if (numOne > numTwo){
        var arr = IntArray(0)
        for (i in numTwo..numOne){
            arr += i
        }
        printArray(arr)

    }else if (numOne == numTwo){
        var arr = IntArray(0)
        for ( i  in 1..numOne){
            arr += numOne
        }
        printArray(arr)
    }else{
        var arr = IntArray(0)
        for (i in numOne..numTwo){
            arr += i
        }
        printArray(arr)
    }
}
fun printArray(arr: IntArray){
    println(" ")
    print("Массив: ")
    for(j in arr){
        if (arr.indexOf(j) < (arr.size - 1)){
            print(" $j,")
        }else{
            print(" $j")
        }
    }
    println(" ")
}


fun LabFourTaskTwo(){
    var arr = IntArray(0)
    var array:Array<Int> = arrayOf(8, 21, 5, 90, 11, 0)
    arr += array.toIntArray()
    printArray(arr)
    arr[0] = 90
    printArray(arr)
    arr = remove(arr, 4)
    printArray(arr)
    arr += -35
    printArray(arr)
}

fun remove(arr: IntArray, index: Int): IntArray {
    if (index < 0 || index >= arr.size) {
        return arr
    }

    val result = arr.toMutableList()
    result.removeAt(index)
    return result.toIntArray()
}


fun LabFourTaskThree(){
    var arr = arrayOf(24, -63, 67, -12, 88, 94, -28, 82, 0, 53)
    println("Исходный Массив: " + arr.contentToString())
    arr.sort()
    var minValue = arr[0]
    var maxValue = arr[arr.size - 1]

    println("Остартированный Массив: " + arr.contentToString())
    println("Минимальны элемент в массиве: $minValue")
    println("Максимальный элемент в массиве: $maxValue")

}

fun LabFourTaskFour(){
    println("Введите размер массива")
    val size = readln()
    var arr = IntArray(0)
    for (i in 1..size.toInt()){
        println("Введите число:")
        val input = readln()
        arr += input.toInt()
    }

    println("Исходный Массив: " + arr.contentToString())
    arr.sort()
    println("Остартированный Массив: " + arr.contentToString())
     var twoNum = arr[1]
    println("Второй самый маленький элемент: $twoNum")
}


fun LabFourTaskFive(){
    println("Введите размер массива")
    val size = readln()
    var arr = IntArray(0)
    for (i in 1..size.toInt()){
        println("Введите число:")
        val input = readln()
        arr += input.toInt()
    }

    println("Исходный Массив: " + arr.contentToString())
    bubbleSort(arr)
    println("Отсортированный Массив: " + arr.contentToString())




}

fun bubbleSort(arr: IntArray) {
    val n = arr.size
    for (i in 0 until n - 1) {
        for (j in 0 until n - i - 1) {
            if (arr[j] > arr[j + 1]) {
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }
}

fun LabFourTaskSix(){
    println("Введите размер массива")
    val size = readln()
    var arr = IntArray(0)
    for (i in 1..size.toInt()){
        println("Введите число:")
        val input = readln()
        arr += input.toInt()
    }

    var sum: Int = 0

    for(j in arr){
        sum += j
    }
    var arithmetic: Double = sum.toDouble()/arr.size


    println(" ")
    print("Массив: ")
    for(j in arr){
        if (arr.indexOf(j) < (arr.size - 1)){
            if (j > arithmetic) {
                print(" $j,")
            }
        }else{
            if (j > arithmetic) {
                print(" $j")
            }
        }
    }
    println(" ")
//    println(arithmetic)
//    5, 8, 18, 34, 3, 56, 43, 27, 4, 23
}


fun LabFiveTaskOne(num: Int): String {
    if (num > 1000){
        var result: Int = num / 1000
        var str: String = result.toString() + "K"
        return str
    }else{
        return num.toString()
    }
}

fun LabFiveTaskTwo(num: Int){
    var txt: String = num.toString()

    println(txt.last())
//        if (txt.last() ))

}