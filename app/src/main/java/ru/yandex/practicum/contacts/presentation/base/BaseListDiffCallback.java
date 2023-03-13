package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

import ru.yandex.practicum.contacts.presentation.main.ContactUi;

public class BaseListDiffCallback<T extends ListDiffInterface<T>> extends DiffUtil.ItemCallback<T> {

    public Object getChangePayload(@NonNull T oldItem, @NonNull T newItem) {
        return newItem;
    }

    //***Здесь должен вызываться соответствующий метод из ListDiffInterface
    @Override
    public boolean areContentsTheSame(@NonNull T oldItem, @NonNull T newItem) {
        return oldItem.equals(newItem);
    }

    //Реализацию метода areItemsTheSame() необходимо заменить на реализацию с использованием метода theSameAs() интерфейса ListDiffInterface.
    //***Здесь должен вызываться соответствующий метод из ListDiffInterface
    @Override
    public boolean areItemsTheSame(@NonNull T oldItem, @NonNull T newItem) {
        return oldItem.theSameAs(newItem);
    }

    //public boolean theSameAs(@NonNull T t) { return this.hashCode() == t.hashCode(); }  //***удалить, после первой проверки

    //public boolean equals(T t) {        return false;    }    //***удалить, после первой проверки

}

