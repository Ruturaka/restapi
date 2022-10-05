package com.example.demo.repository;

import com.example.demo.model.Tutorial;
import java.util.List;

public interface TutorialRepository {
    //is an interface that provides abstract methods for CRUD
    // Operations and custom finder methods. It will be
    // autowired in TutorialController.

    int save(Tutorial book);

    int update(Tutorial book);

    Tutorial findById(Long id);

    int deleteById(Long id);

    List<Tutorial> findAll();

    List<Tutorial> findByPublished(boolean published);

    List<Tutorial> findByTitleContaining(String title);

    int deleteAll();
}
