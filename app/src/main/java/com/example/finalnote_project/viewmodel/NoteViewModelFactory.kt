package com.example.finalnote_project.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.finalnote_project.data.NoteRepository
import java.lang.IllegalArgumentException

class NoteViewModelFactory(private val repository: NoteRepository):ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(NoteViewModel::class.java)){
            return NoteViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown View Model class")
    }
}