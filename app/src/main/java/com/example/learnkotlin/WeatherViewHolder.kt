package com.example.learnkotlin

import android.view.View
import androidx.recyclerview.widget.RecyclerView

class WeatherViewHolder (itemViev: View) : RecyclerView.ViewHolder(itemViev)
// Имя родительского класса указывается после двоеточия,
// как и имя реализуемого интерфейса.
// Если интерфейсов несколько,
// то они перечисляются через запятую.
// В этом случае родительский класс имеет конструктор,
// принимающий View в качестве параметра,
// поэтому мы обязаны передать его при создании.