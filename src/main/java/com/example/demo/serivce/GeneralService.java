package com.example.demo.serivce;

import java.util.Optional;

public interface GeneralService<T> {
    void save(T object);

    void delete(Long id);

    Iterable<T> findAll();

    Optional<T> findById(Long id);
}