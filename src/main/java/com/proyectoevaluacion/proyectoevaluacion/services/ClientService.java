package com.proyectoevaluacion.proyectoevaluacion.services;

import com.proyectoevaluacion.proyectoevaluacion.moduls.Client;
import com.proyectoevaluacion.proyectoevaluacion.respositories.ClientRepository;
import com.proyectoevaluacion.proyectoevaluacion.respositories.ICRUD;

import java.util.List;

public class ClientService implements ICRUD<Client> {

    ClientRepository repository;

    @Override
    public List<Client> findAll() throws Exception {
        return repository.findAll();
    }

    @Override
    public Client getById(Integer id) throws Exception {
        return repository.findById(id).get();
    }

    @Override
    public Client save(Client obj) {
        return repository.save(obj);

    }

    @Override
    public void update(Client obj, Integer id) {
        obj.setId(id);
        repository.save(obj);

    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);


    }
}
//orden para crear el proyecto
//aplication properties
//modelos
//urls
//        repositorioi
//servicio
//                rescontroler
//controller
//                        vistas
//front