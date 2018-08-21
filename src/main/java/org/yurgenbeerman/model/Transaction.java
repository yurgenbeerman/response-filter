package org.yurgenbeerman.model;

/**
 * Created by yurii.pyvovarenko on 8/20/2018.
 */

import lombok.Data;

@Data
public class Transaction {
    Long id;
    String sourceName;

    public Transaction() {}

    public Transaction(Long id, String sourceName) {
        this.id = id;
        this.sourceName = sourceName;
    }
}
