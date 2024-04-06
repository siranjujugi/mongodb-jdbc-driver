package com.wisecoders.dbschema.mongodb.resultSet;

import com.wisecoders.dbschema.mongodb.MongoResultSetMetaData;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;

/**
 * Copyright Wise Coders GmbH. The MongoDB JDBC driver is build to be used with DbSchema Database Designer https://dbschema.com
 * Free to use by everyone, code modifications allowed only to
 * the public repository https://github.com/wise-coders/mongodb-jdbc-driver
 */
public class OkResultSet extends ResultSetIterator {

    public OkResultSet(){
    }

    @Override
    public Object getObject(int columnIndex) throws SQLException {
        return "Ok";
    }

    @Override
    public boolean next() throws SQLException {
        return false;
    }

    @Override
    public void close() throws SQLException {
    }

    @Override
    public ResultSetMetaData getMetaData() throws SQLException {
        return new MongoResultSetMetaData("Result", new String[]{"object"},  new int[]{Types.JAVA_OBJECT},new int[]{300});
    }

}
