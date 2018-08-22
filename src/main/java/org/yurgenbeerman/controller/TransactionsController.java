package org.yurgenbeerman.controller;

/**
 * Created by yurii.pyvovarenko on 8/20/2018.
 */
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yurgenbeerman.model.LastLoad;
import org.yurgenbeerman.model.Transaction;

@RestController
@RequestMapping("/api/v2/api/transactions")
public class TransactionsController {

    @GetMapping("/")
    public List<Transaction> transactions() {
        final Transaction transaction1 = new Transaction(1L,"ДЖЕРЕЛО");
        final Transaction transaction2 = new Transaction(1L,"ДЖЕРЕЛО");
        final List<Transaction> transactions = new ArrayList<>();
        transactions.add(transaction1);
        transactions.add(transaction2);
        return transactions;
    }

    @GetMapping("/lastload")
    public LastLoad lastLoad() {
        final LastLoad lastLoad = new LastLoad(1L,"ДЖЕРЕЛО", "2018-08-20");
        lastLoad.setLastLoad("2018-08-20");
        lastLoad.setSourceId(1L);

        return lastLoad;
    }

    @GetMapping("/lastloads")
    public List<LastLoad> lastLoads() {
        final LastLoad lastLoad1 = new LastLoad(2L,"ДЖЕРЕЛО1", "2018-08-21");
        final LastLoad lastLoad2 = new LastLoad(3L,"ДЖЕРЕЛО2", "2018-08-22");

        final List<LastLoad> lastLoads = new ArrayList<>();
        lastLoads.add(lastLoad1);
        lastLoads.add(lastLoad2);

        return lastLoads;
    }

    //see https://octoperf.com/blog/2018/02/22/spring-boot-rest-tutorial/#restassured-unit-test
    //use Content-type: application/json header {"id":111,"sourceName":"НОВЕ ДЖЕРЕЛО"} body for POST tests
    @PostMapping("/")
    public String postHello(@RequestBody final Transaction transaction) {
        return "POST: " + transaction.getId() + " - " + transaction.getSourceName();
    }
}
