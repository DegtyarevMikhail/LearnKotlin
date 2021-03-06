package com.example.learnkotlin

class MainViewState (val weatherList: List<Weather>)
/*
В Kotlin не используется понятие «переменная класса»,
но есть термин «свойство класса».
Различие в том, что свойство содержит не только значение переменной,
 но и геттер с сеттером. Когда объявляем переменную типа var в классе,
 для неё автоматически создаются методы get и set. Мы их не видим,
 если не требуется их переопределять.
 Свойства класса могут объявляться прямо в конструкторе:


Посмотрим, во что это компилируется:
public final class MainViewState {
  @NotNull
  private final List weatherList;

  @NotNull
  public final List getWeatherList() {
     return this.weatherList;
  }

  public MainViewState(@NotNull List weatherList) {
     this.weatherList = weatherList;
  }
}

Важно! В Android Studio можно посмотреть байт-код, куда компилируется код,
написанный на Kotlin. Ещё есть декомпилятор,
 который может декомпилировать байт-код в код на Java.
Для этого надо выбрать пункт меню Tools → Kotlin → Show Kotlin bytecode.
 Далее в открывшемся справа окне нажать Decompile.
Чтобы обратиться к свойству класса из кода на Kotlin,
не надо вызывать getter явно. Обращаемся к нему, как к public-переменной в Java:
val viewState = ViewState(weatherList)
var someWeatherList = viewState.weatherList


Но «под капотом» вызывается метод getWeatherList(,
 который мы видели в декомпилированном классе.
Свойства классов должны проинициализироваться в момент создания класса:
 в конструкторе или прямым присвоением значения в месте объявления.
 Это сделано для безопасности, чтобы нельзя было обратиться к свойству,
  которое не проинициализировано.
  Но возможна отложенная инициализация через ключевое слово lateinit:
lateinit var viewModel: MainViewModel


Объявляя таким образом свойство, мы говорим компилятору, что берём на себя ответственность за инициализацию. Если обратиться к такому свойству до его инициализации, то выбросится UninitializedPropertyAccessException, и приложение «упадёт». Эту возможность надо использовать с осторожностью.

 */