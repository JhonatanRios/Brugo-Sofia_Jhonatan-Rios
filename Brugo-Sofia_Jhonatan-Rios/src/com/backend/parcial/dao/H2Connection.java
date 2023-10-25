package com.backend.parcial.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class H2Connection {
    private static final String DB_JDBC_DRIVER = "org.h2.Driver";
    private static final String DB_URL = "jdbc:h2:~/parcial";
    private static final String DB_USER = "sa";
    private static final String DB_PASSWORD = "ParcialC1-2023";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        //indicar que driver voy a usar
        Class.forName(DB_JDBC_DRIVER);
        //crear la conexion
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }
}