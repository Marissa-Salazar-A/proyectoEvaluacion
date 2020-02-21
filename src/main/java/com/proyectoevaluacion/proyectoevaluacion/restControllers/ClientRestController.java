package com.proyectoevaluacion.proyectoevaluacion.restControllers;

import com.proyectoevaluacion.proyectoevaluacion.moduls.Client;
import com.proyectoevaluacion.proyectoevaluacion.services.ClientService;
import com.proyectoevaluacion.proyectoevaluacion.utils.UrlConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public class ClientRestController {

    @Autowired
    ClientService clientService;

//    @GetMapping(UrlConstants.Listar)
//    public List<Client> listClient() throws Exception {
//        return clientService.findAll();
//    }

    @RequestMapping(UrlConstants.CLIENTE_AGREGAR)
    public void agregar(@RequestBody Client client){
        clientService.save(client);
    }

    @RequestMapping(UrlConstants.CLIENTE_UPDATE)
    public void update(@RequestBody Client client, @PathVariable int id){
        clientService.update(client, id);
    }

    @RequestMapping(UrlConstants.CLIENTE_AGREGAR)
    public void delete(@PathVariable int id){
        clientService.deleteById(id);
    }




}
