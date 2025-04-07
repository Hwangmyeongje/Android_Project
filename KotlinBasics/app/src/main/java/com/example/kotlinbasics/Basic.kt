package com.example.kotlinbasics

fun main(){
    val myBook = Book()
    println("Title: ${myBook.title}")
    println("Author: ${myBook.author}")
    println("Year Published: ${myBook.yearPublished}")
    val customBook = Book("soccer", "HMJ","1999")
    println("Title: ${customBook.title}")
    println("Author: ${customBook.author}")
    println("Year Published: ${customBook.yearPublished}")
}