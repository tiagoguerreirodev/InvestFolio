package br.com.tiagoguerreirodev.investfolio.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TransactionType {
    BUY("buy"),
    SELL("sell");

    private final String type;
}
