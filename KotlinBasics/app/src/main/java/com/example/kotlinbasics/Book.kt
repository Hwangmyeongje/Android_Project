package com.example.kotlinbasics

class Book (val title: String = "Unknown", val author: String = "Annoymous", val yearPublished: String = "2025"){
    init{
        bark(title)
    }
    fun bark(name:String){
        println("$name says Woof Woof")
    }
}