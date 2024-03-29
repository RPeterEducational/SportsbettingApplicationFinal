package com.example.application.repository;

import com.example.domain.entities.Wager;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WagerRepository extends CrudRepository<Wager, Integer> {
    void deleteById(int id);
}
