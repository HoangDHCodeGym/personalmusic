package com.codegym.personalmusic.controller;

import com.codegym.personalmusic.model.Song;
import com.codegym.personalmusic.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/song")
public class SongController {
    @Autowired
    SongRepository songRepository;

    @GetMapping()
    List<Song> getAll() {
        return songRepository.findAll();
    }

}
