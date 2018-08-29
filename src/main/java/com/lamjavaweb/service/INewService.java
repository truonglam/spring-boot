package com.lamjavaweb.service;

import com.lamjavaweb.dto.NewDTO;

import java.util.List;

public interface INewService {
    NewDTO insert(NewDTO newDTO);
    List<NewDTO> findAll();
}
