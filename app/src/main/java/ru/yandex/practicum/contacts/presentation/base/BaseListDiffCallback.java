package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

import ru.yandex.practicum.contacts.presentation.main.ContactUi;

public class BaseListDiffCallback<T extends ListDiffInterface> implements ListDiffInterface<T> {


    @Override
    public boolean theSameAs(@NonNull T t) {
        return this.hashCode() == t.hashCode();
    }

    @Override
    public boolean equals(ContactUi contactUi) {
        return false;
    }



    public Object getChangePayload(@NonNull ContactUi oldItem, @NonNull ContactUi newItem) {
        return newItem;
    }


    public boolean areContentsTheSame(@NonNull T oldItem, @NonNull T newItem) {
        return false;
    }
}

