package springboot.repository;

import springboot.domain.Anime;

import java.util.List;

public interface AnimeRepository {
    List<Anime> listAll();
}