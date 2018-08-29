package com.lamjavaweb.api.admin;

import com.lamjavaweb.dto.NewDTO;
import com.lamjavaweb.service.INewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value = "newAPIOfAdmin")
public class NewAPI {

    @Autowired
    private INewService newService;

    @PostMapping("/api/admin/new")
    public ResponseEntity<NewDTO> createNew(@RequestBody NewDTO newDTO) {
        return ResponseEntity.ok(newService.insert(newDTO));
    }

    @GetMapping("/api/admin/new")
    public ResponseEntity<List<NewDTO>> getNews() {
        return ResponseEntity.ok(newService.findAll());
    }
}
