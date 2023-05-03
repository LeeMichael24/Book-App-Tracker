package com.example.booktrackerapp.repositories

import com.example.booktrackerapp.data.Author
import com.example.booktrackerapp.data.Book

class BooksRepository(private val books: List<Book>) {

    fun getBooks() = books

    fun getBooksByAuthor(author: Author) =
        //esto significa que recibira info y la filtrara por autores y retornana el valor
        books.filter { books ->
            books.authors.contains(author)
        }
}