package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

import ru.yandex.practicum.contacts.presentation.main.ContactUi;

public class BaseListDiffCallback<T extends ListDiffInterface<T>> extends DiffUtil.ItemCallback<T> {


    public boolean theSameAs(@NonNull T t) {
        return this.hashCode() == t.hashCode();
    }


    public boolean equals(T t) {
        return false;
    }



    public Object getChangePayload(@NonNull T oldItem, @NonNull T newItem) {
        return newItem;
    }


    @Override
    public boolean areItemsTheSame(@NonNull T oldItem, @NonNull T newItem) {
        return false;
    }

    public boolean areContentsTheSame(@NonNull T oldItem, @NonNull T newItem) {
        return false;
    }
}

