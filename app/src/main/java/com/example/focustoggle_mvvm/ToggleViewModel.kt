package com.example.focustoggle_mvvm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class ToggleViewModel : ViewModel() {

    private val repository = Repository()

    private val _todos = MutableStateFlow<List<Todos>>(emptyList())

    val todos : StateFlow<List<Todos>> = _todos

    fun fetchTodos(){
        viewModelScope.launch {
            _todos.value = repository.getTodos()
        }
    }
}