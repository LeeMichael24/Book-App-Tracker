package com.example.booktrackerapp

import android.app.Application
import com.example.booktrackerapp.data.books
import com.example.booktrackerapp.repositories.BooksRepository

class BooksTrackerApplication: Application() {
    //con esto se logra que la variable books pueda acceder a data books para que el viewmodel tenga igual acceso y asi se sigue la logica de negocio
    //y by lazy se crea hasta que alguien o se necesite se crea, de esta forma se optimiza nuestro codigo

    val booksRepository: BooksRepository by lazy {
        BooksRepository(books)
    }
}  //Aca se crea la clase de la aplicacion, y se crea una variable que se llama booksRepository que es de tipo BooksRepository