package com.example.myapplication.ui.Page2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Fragment2ViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Еще одна страница"
    }
    val text: LiveData<String> = _text
}