package com.kebaudin.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kebaudin.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
