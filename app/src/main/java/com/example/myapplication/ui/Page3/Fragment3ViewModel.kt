package com.example.myapplication.ui.Page3

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Fragment3ViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Тут что-то будет"
    }
    val text: LiveData<String> = _text
}