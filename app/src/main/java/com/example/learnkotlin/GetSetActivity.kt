package com.example.learnkotlin

class GetSetActivity {
    /*
    Методы get и set
Когда мы присваиваем значение переменной класса,
 часто требуется выполнить и конкретные действия.
 В Java делаем это в методах доступа к переменной.
  В Kotlin это выглядит иначе:
  */
var weatherList: List<Weather> = listOf<Weather>()
   set(value) {
       field = value
       notifyDataSetChanged()
   }

    private fun notifyDataSetChanged() {
        TODO("Not yet implemented")
    }

    /*
    Чтобы переопределить setter, используем ключевое слово set. Value в этом примере — значение, которое присваивается свойству weatherList, а field — это специальное поле, где хранится значение свойства weatherList.
    Таким же образом переопределяется getter:
    */
class ViewState(val weatherList: List<Weather>) {

   val hasData: Boolean
        get() = weatherList.size != 0
}
/*

Здесь видим, что свойство hasData не имеет собственного значения и при обращении каждый раз вычисляет его, сравнивая массив с нулём.

     */
}