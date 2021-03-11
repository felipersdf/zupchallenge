package com.felipe.zupchallenge.repository;

import com.felipe.zupchallenge.entity.Vacina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VacinaRepository extends JpaRepository<Vacina, Long> {
}
