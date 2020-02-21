package com.proyectoevaluacion.proyectoevaluacion.respositories;

import com.proyectoevaluacion.proyectoevaluacion.moduls.Client;

import java.util.List;

public interface ICRUD<T> {

    List<T> findAll() throws  Exception;
    T getById(Integer id) throws Exception;
    Client save (T obj);
    void update(T obj, Integer id);
    void deleteById(Integer id);

}
