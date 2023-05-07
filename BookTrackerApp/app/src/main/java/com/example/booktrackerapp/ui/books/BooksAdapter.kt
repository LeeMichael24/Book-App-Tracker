package com.example.booktrackerapp.ui.books

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.booktrackerapp.R
import com.example.booktrackerapp.data.Book
import com.example.booktrackerapp.data.books

class BooksAdapter: RecyclerView.Adapter<BooksAdapter.ViewHolderBook>() {

    private var books: List<Book>? = null

    class ViewHolderBook(itemView: View): RecyclerView.ViewHolder(itemView) {

        fun bind(book: Book){
            itemView.findViewById<TextView>(R.id.book_name).text = book.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderBook {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater
            .inflate(
                R.layout.item_book,
                parent,
                false
            )

        return ViewHolderBook(view)
    }

    override fun getItemCount(): Int = books?.size ?: 0

    override fun onBindViewHolder(holder: ViewHolderBook, position: Int) {
        books?.let {
            holder.bind(it[position])
        }
    }

    fun submitData(books: List<Book>){
        this.books = books
        notifyDataSetChanged()
    }
}