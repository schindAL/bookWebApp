/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.ams.bookwebapp.model;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 *
 * @author aschindler1
 */
public interface DbAccessor {

    void closeConnection() throws SQLException;

    List<Map<String, Object>> findRecordsFor(String tableName, int maxRecords) throws SQLException;

    //consider creating a custom exception
    void openConnection(String driverClass, String url, String username, String password) throws ClassNotFoundException, SQLException;
    
}