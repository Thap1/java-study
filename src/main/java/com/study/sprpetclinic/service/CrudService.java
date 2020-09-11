package com.study.sprpetclinic.service;

import java.util.Set;

public interface CrudService<T, ID> {
    Set<T> fillAll();

    T findById(ID id);
    T save(T object);
    void delete(T object);
    void deleteById(ID id);
}
