package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface <T> {
    boolean theSameAs(T UI);

    boolean equals(Object obj);
}
