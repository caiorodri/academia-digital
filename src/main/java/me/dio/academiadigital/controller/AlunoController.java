package me.dio.academiadigital.controller;

import me.dio.academiadigital.entity.Aluno;
import me.dio.academiadigital.entity.form.AlunoForm;
import me.dio.academiadigital.service.impl.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoServiceImpl service;

    @GetMapping
    public List<Aluno> getAll(){

        return service.getAll();

    }

    @PostMapping
    public Aluno create(@RequestBody AlunoForm form){

        return service.create(form);

    }



}
