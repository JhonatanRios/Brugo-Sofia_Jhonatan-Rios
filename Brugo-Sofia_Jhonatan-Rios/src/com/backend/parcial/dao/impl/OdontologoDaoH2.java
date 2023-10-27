package com.backend.parcial.dao.impl;

import com.backend.parcial.dao.IDao;
import com.backend.parcial.model.Odontologo;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class OdontologoDaoH2 implements IDao<Odontologo> {

    private final Logger LOGGER = Logger.getLogger(OdontologoDaoH2.class);
    private Connection connection;
    private PreparedStatement preparedStatement;

    @Override
    public Odontologo guardar(Odontologo odontologo) {
        connection = null;
        preparedStatement = null;
        return null;
    }

    @Override
    public List<Odontologo> listarTodos() {
        return null;
    }
}
