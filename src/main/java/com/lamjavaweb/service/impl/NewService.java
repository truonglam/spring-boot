package com.lamjavaweb.service.impl;

import com.lamjavaweb.converter.NewConverter;
import com.lamjavaweb.dto.NewDTO;
import com.lamjavaweb.entity.NewEntity;
import com.lamjavaweb.repository.NewRepository;
import com.lamjavaweb.service.INewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class NewService implements INewService {

    @Autowired
    private NewConverter newConverter;

    @Autowired
    private NewRepository newRepository;

    @Override
    @Transactional
    public NewDTO insert(NewDTO newDTO) {
        NewEntity newEntity = newConverter.convertToEntity(newDTO);
        return newConverter.convertToDto(newRepository.save(newEntity));
    }

    @Override
    public List<NewDTO> findAll() {
        List<NewDTO> newDTOS = new ArrayList<>();
        newRepository.findAll().forEach(item -> {
            newDTOS.add(newConverter.convertToDto(item));
        });
        return newDTOS;
    }
}
