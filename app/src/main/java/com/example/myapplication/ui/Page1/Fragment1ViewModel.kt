package com.example.myapplication.ui.Page1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Fragment1ViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Главная страница"
    }
    val text: LiveData<String> = _text
}