package br.com.tiagoguerreirodev.investfolio.repository;

import br.com.tiagoguerreirodev.investfolio.document.Transaction;
import org.springframework.data.domain.Page;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TransactionHistoryRepository extends MongoRepository<Transaction, String> {
    Page<Transaction> findByUserIdOrderByCreatedAtDesc(String userId);
}
