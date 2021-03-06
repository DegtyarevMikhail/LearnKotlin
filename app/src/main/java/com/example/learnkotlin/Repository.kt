package com.example.learnkotlin

// class
object Repository {


    private val weatherList: List<Weather>

    init {
        weatherList = listOf( Weather("Москва", 15))
    }

}

// В Kotlin есть удобный и простой способ создавать синглтоны.
// Чтобы класс всегда оставался в единственном экземпляре
// на протяжении работы приложения,
// достаточно заменить слово class на object:


//Определённый таким образом класс будет синглтоном.
// Обращаться из кода на Kotlin к нему можно напрямую:
//Repository.getWeatherList()
//
//
//Если надо вызвать этот класс из Java,
// то писать потребуется немного больше.
// Это специфический синтаксис взаимозаменяемых языков. Об INSTANCE — далее.
//Repository.INSTANCE.getWeatherList()

// Функции в Kotlin объявляются следующим образом:
//fun getWeather(): List<Weather> {
   // return weatherList
//}
//  Первым следует ключевое слово fun,
//  далее — название функции с принимаемыми аргументами в скобках,
//  после двоеточия — возвращаемое значение.
//  После объявления идёт тело функции в фигурных скобках.
//  Когда функция ничего не возвращает, возвращаемое значение опускается:


//fun onBindViewHolder(holder: WeatherViewHolder, position: Int) {
 //   holder.bind(weatherList[position])
//}


//   Возвращаемое значение приведённой выше функции — Unit.
//   Это аналог void в Java, только Unit — это объект.
//   Об этом и других типах в Kotlin поговорим позже.
//   Когда тело функции записывается одним выражением,
//   фигурные скобки можно опустить и записать через «=».
//   Да, к этому тоже надо привыкнуть.
//override fun getItemCount() = weatherList.size


//  В нашем случае компилятор может вывести тип из возвращаемого значения выражения,
//  поэтому указывать его необязательно.
//  Ключевое слово override в начале объявления функции
//  — аналог аннотации @Override в Java.
//  Это означает, что такой метод переопределяет метод базового класса.