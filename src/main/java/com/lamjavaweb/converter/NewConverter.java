package com.lamjavaweb.converter;

import com.lamjavaweb.dto.NewDTO;
import com.lamjavaweb.entity.NewEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NewConverter {

    @Autowired
    private ModelMapper modelMapper;

    public NewDTO convertToDto(NewEntity entity) {
        NewDTO result = modelMapper.map(entity, NewDTO.class);
        return result;
    }

    public NewEntity convertToEntity(NewDTO dto) {
        NewEntity result = modelMapper.map(dto, NewEntity.class);
        return result;
    }
}
