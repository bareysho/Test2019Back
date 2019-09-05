package com.bfwg.repository;

import com.bfwg.model.ClientCard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientCardRepository extends JpaRepository<ClientCard, Long> {

    List<ClientCard> findAllBy
    ClientCard findClientCardByNameAndSecondName(String name, String secondName);
}
