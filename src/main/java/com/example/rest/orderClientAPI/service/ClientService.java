package com.example.rest.orderClientAPI.service;

import com.example.rest.orderClientAPI.model.Client;

import java.util.List;

public interface ClientService {

    List<Client> findAll();

    Client findById(Long id);

    Client save(Client client);

    Client update(Client client);

    void deleteById(Long id);
}
