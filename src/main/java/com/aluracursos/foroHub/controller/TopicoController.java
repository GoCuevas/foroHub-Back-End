package com.aluracursos.foroHub.controller;

import com.aluracursos.foroHub.dto.topico.DatosActualizarTopico;
import com.aluracursos.foroHub.dto.topico.DatosRegistroTopico;
import com.aluracursos.foroHub.dto.topico.DatosListadoTopico;
import com.aluracursos.foroHub.model.Topico;
import com.aluracursos.foroHub.repository.TopicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jakarta.transaction.Transactional;


import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoRepository topicoRepository;

    // POST - crear nuevo tópico
    @PostMapping
    public void registrarTopico(@RequestBody @Valid DatosRegistroTopico datos) {
        topicoRepository.save(new Topico(datos));
    }

    // GET - listar todos los tópicos
    @GetMapping
    public List<DatosListadoTopico> listado() {
        return topicoRepository.findAll().stream()
                .map(topico -> new DatosListadoTopico(
                        topico.getId(),
                        topico.getTitulo(),
                        topico.getMensaje(),
                        topico.getFechaCreacion()
                ))
                .toList();
    }

    @PutMapping
    @Transactional
    public void actualizarTopico(@RequestBody @Valid DatosActualizarTopico datos) {
        Topico topico = topicoRepository.getReferenceById(datos.id());
        if (datos.titulo() != null) topico.setTitulo(datos.titulo());
        if (datos.mensaje() != null) topico.setMensaje(datos.mensaje());
    }

}
