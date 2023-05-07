package com.example.booktrackerapp.ui.books

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.example.booktrackerapp.R
import com.example.booktrackerapp.databinding.FragmentBooksBinding


class BooksFragment : Fragment() {

    private lateinit var binding: FragmentBooksBinding
    private val viewModel: BooksViewModel by viewModels {
        BooksViewModel.Factory
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        //En esta parte queremos devolver la View, entonces hacemos eso, y como el inflater ya esta en la parte de arriba
        // lo unico es enviarselo al binding“ con el id del elemento, el contenedor, y se se opone o no con el padre = false

        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_books,
            container,
            false)
        return binding.root
        //aca para que el return devuelva toda la info como: los id, atributos y elementos del binding se coloca binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recyclerBooks.adapter = BooksAdapter().apply {
            submitData(viewModel.getBooks())
        }
    }

}