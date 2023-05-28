package br.com.tiagoguerreirodev.investfolio.document;

import br.com.tiagoguerreirodev.investfolio.constant.TransactionType;
import lombok.Builder;
import lombok.Value;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "TransactionHistory")
@Value
@Builder
public class Transaction {
    @Id
    String id;
    String userId;
    String transactionId;
    Double amount;
    TransactionType transactionType;
    LocalDateTime createdAt;
}
