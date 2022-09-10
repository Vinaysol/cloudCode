package com.poc.cloudCode.repositories;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class CoderRepo implements CoderRepository{
    @Override
    public List<Coder> findAll() {
        List<Coder> clist= new ArrayList<>();
        clist.add(new Coder());
        return clist;

    }

    @Override
    public Optional<Coder> findById(Long id) {
         if(id == 1l) return Optional.of(new Coder());

         return   Optional.empty();

    }

    @Override
    public Coder save(Coder coder) {
        return coder;
    }

    @Override
    public void deleteById(Long id) {
        System.out.println(" deleted :"+id);

    }
}
