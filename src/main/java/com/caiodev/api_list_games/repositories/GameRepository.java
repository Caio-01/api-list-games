package com.caiodev.api_list_games.repositories;

import com.caiodev.api_list_games.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {


}
