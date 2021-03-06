package com.example.learnkotlin

class Parametrs {
/*
Параметры функций и конструкторов записываются в таком виде — сначала имя, потом тип параметра:
name: Type


В Kotlin, как и в Java, функции принимают нефиксированное количество параметров — varargs. Но обозначаются такие параметры немного иначе, чем в Java. В языке Kotlin надо использовать модификатор vararg. Внутри функции такие параметры выглядят как массив.
fun printStrings(vararg strings: String) {
    for(s in strings) {
        println(s)
    }
}


В Kotlin есть понятие «параметры по умолчанию». Это означает, что можно задать параметры метода или конструктора, которые будут подставлены компилятором, если мы не зададим их при вызове метода. Например, зададим город и температуру по умолчанию:
class Weather(val town: String = "Москва",
           val temperature: Int = 15)


Теперь можно создавать объект Weather, не передавая в конструктор параметры:
val w = Weather()


Или передавать только один. Второй параметр будет равен значению по умолчанию:
val w = Weather("Саратов")


Так создаются перегруженные методы, а не ряд методов с разным набором параметров. Можно сделать один и задать всем параметрам значения по умолчанию. В некоторых случаях классу требуется конструктор по умолчанию (без параметров). Вот как можно сделать это для погоды:
class Weather(
   val town: String = "",
   val temperature: Int = 0
)


 */


}