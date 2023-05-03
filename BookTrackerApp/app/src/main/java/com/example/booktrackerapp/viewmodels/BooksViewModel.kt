package com.example.booktrackerapp.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.booktrackerapp.BooksTrackerApplication
import com.example.booktrackerapp.repositories.BooksRepository

//Aca recibimos la fuente de datos para este ViewModel, asiq ue la recibimos a travez de parametros
//como repositorio y esa sera la fuente o el punto de confianza

class BooksViewModel(val booksRepository: BooksRepository): ViewModel() {

    fun getBooks() = booksRepository.getBooks()


    companion object {
        val Factory = viewModelFactory {
            initializer {
                val booksRepository =
                    (this[APPLICATION_KEY] as BooksTrackerApplication).booksRepository
                BooksViewModel(booksRepository)
            }
        }
    }
}
