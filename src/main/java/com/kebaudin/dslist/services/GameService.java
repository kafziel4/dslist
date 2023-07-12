package com.kebaudin.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kebaudin.dslist.dto.GameDTO;
import com.kebaudin.dslist.dto.GameMinDTO;
import com.kebaudin.dslist.repositories.GameRepository;

@Service
public class GameService {
  @Autowired
  private GameRepository gameRepository;

  @Transactional(readOnly = true)
  public List<GameMinDTO> findAll() {
    var result = gameRepository.findAll();
    return result.stream().map(x -> new GameMinDTO(x)).toList();
  }

  @Transactional(readOnly = true)
  public GameDTO findById(Long id) {
    var result = gameRepository.findById(id).get();
    return new GameDTO(result);
  }
}
