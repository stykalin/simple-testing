package ru.simple.testing.testdata;

import java.util.List;

public interface TestData<T extends Identifiable> {

    List<T> getTestData();


    default T getById(Integer id) {
        return getTestData().stream().filter(e -> e.getId().equals(id)).findFirst().orElseThrow(() -> new IllegalStateException("В тестовых данных не найдена запись с id = " + id));
    }

}
