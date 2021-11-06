package com.example.myapplication

class Book {
    var name : String = ""
    var author : String = ""
    var pageNumber : Int = 0
    var summery : String = ""
    fun printSummery () {
        println(summery)
    }


}


fun main (){
    var book1 = Book()
    book1.name = "Sherlock"
    book1.author = "arthur"
    book1.pageNumber = 500
    book1.summery = "arthurarthurarthurarthurarthurarthurarthurarthurarthurarthur"
    book1.printSummery()

}