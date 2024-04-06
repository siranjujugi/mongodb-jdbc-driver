package com.wisecoders.dbschema.mongodb.structure;


import java.util.ArrayList;
import java.util.List;

/**
 * Copyright Wise Coders GmbH. The MongoDB JDBC driver is build to be used with DbSchema Database Designer https://dbschema.com
 * Free to use by everyone, code modifications allowed only to
 * the public repository https://github.com/wise-coders/mongodb-jdbc-driver
 */
public class MetaIndex {

    private final MetaObject metaMap;
    public final String name;
    public final List<MetaField> metaFields = new ArrayList<MetaField>();
    public final boolean pk, unique;

    MetaIndex(MetaObject metaMap, String name, boolean pk, boolean unique){
        this.metaMap = metaMap;
        this.name = name;
        this.pk = pk;
        this.unique = unique;
    }

    void addColumn( MetaField metaField ){
        if ( metaField != null ){
            metaFields.add( metaField );
        }
    }
}
