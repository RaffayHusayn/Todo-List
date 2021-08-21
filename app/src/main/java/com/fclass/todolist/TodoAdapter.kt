package com.fclass.todolist

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


//contains the main logic of the app
class TodoAdapter(
    private val todos: MutableList<Todo>
): RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {

    class TodoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {

    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {

    }


}