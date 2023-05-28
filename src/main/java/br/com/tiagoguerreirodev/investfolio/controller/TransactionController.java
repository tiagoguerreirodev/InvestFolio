package br.com.tiagoguerreirodev.investfolio.controller;

import br.com.tiagoguerreirodev.investfolio.api.TransactionsApi;
import org.springframework.http.ResponseEntity;

public class TransactionController implements TransactionsApi {
    @Override
    public ResponseEntity<String> retrieveTransactions(String userId) {
        return TransactionsApi.super.retrieveTransactions(userId);
    }
}
