package com.example.definition.data.cloud.core

import com.example.definition.data.cloud.model.License
import com.example.definition.data.cloud.model.Word

sealed class ApiResult(val word: Word) {

    //Клас Success, який присвоюює значення слова, що користувач ввів, у значення json, що потрібно знайти

    class Success(word: Word) : ApiResult(word = word)

    // опис помилки, якщо слово невірне
    object Error : ApiResult(word = Word(License("", ""), emptyList(), emptyList(), emptyList(), ""))

}