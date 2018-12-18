package com.codegym.personalmusic.repository;

import com.codegym.personalmusic.model.Song;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface SongRepository extends PagingAndSortingRepository<Song, Long> {
    List<Song> findAll();
}
