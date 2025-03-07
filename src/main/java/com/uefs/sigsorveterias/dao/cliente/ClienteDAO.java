package com.uefs.sigsorveterias.dao.cliente;

import com.uefs.sigsorveterias.dao.CRUD;
import com.uefs.sigsorveterias.model.Cliente;

public interface ClienteDAO extends CRUD<Cliente> {

    public Cliente getCliente(int id);
}
