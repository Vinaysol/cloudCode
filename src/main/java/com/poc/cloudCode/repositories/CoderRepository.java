package com.poc.cloudCode.repositories;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


public interface CoderRepository  {

    List<Coder> findAll();

    Optional<Coder> findById(Long id);

    Coder save(Coder coder);

    void deleteById(Long id);
}
