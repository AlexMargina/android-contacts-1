package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;

import ru.yandex.practicum.contacts.presentation.main.ContactUi;

public interface ListDiffInterface <T> {
    // общий для трех адаптеров интерфейс


    //создаем метод, который вернет boolean
     boolean theSameAs (T t);

     boolean equals (Object o) ;

}

