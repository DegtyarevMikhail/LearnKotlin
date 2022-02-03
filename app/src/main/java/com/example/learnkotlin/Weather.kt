package com.example.learnkotlin

class Weather (var town: String, var temperature: Int) {
    companion object : Comparator<Weather> {
        override fun compare(o1: Weather, o2: Weather): Int {
            if (o1.temperature > o2.temperature) {
                return 1
            } else if (o1.temperature == o2.temperature) {
                return 0
            } else {
                return -1
            }
        }
    }

}