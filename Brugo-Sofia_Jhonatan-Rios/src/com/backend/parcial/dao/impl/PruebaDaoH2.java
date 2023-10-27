package com.backend.parcial.dao.impl;

import com.backend.parcial.dao.H2Connection;
import com.backend.parcial.dao.IDao;
import com.backend.parcial.model.Domicilio;
import org.apache.log4j.Logger;

import java.sql.*;
import java.util.List;
/*
public class PruebaDaoH2 implements IDao<Domicilio> {
    private static final String INSERT = "INSERT INTO medicos(nombre, edad, profesion) VALUES(?, ?, ?, ?)";
    Logger LOGGER = Logger.getLogger(PruebaDaoH2.class);
    private Connection conn;
    private PreparedStatement stat;

    @Override
    public Domicilio registrar(Domicilio prueba) {
        Domicilio pruebaResultado = null;
        try {
            conn = H2Connection.getConnection();
            conn.setAutoCommit(false);

            stat = conn.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);

            conn.commit();
            ResultSet result = stat.getGeneratedKeys();
            while (result.next()) {
                pruebaResultado = new Domicilio();
            }
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
            e.printStackTrace();
            if (conn != null) {
                try {
                    conn.rollback();
                    LOGGER.info("Tuvimos un problema");
                    LOGGER.error(e.getMessage());
                    e.printStackTrace();
                } catch (SQLException exception) {
                    LOGGER.error(exception.getMessage());
                    exception.printStackTrace();
                }
            }
        } finally {
            try {
                conn.close();
            } catch (Exception ex) {
                LOGGER.error("No se pudo cerrar la conexion: " + ex.getMessage());
            }
        }
        return pruebaResultado;
    }

    @Override
    public Domicilio buscarPorId(int id) {
        return null;
    }

    @Override
    public List<Domicilio> buscarTodos() {
        return null;
    }


}

 */
