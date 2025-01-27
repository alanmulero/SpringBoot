package voll.med.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import voll.med.api.endereco.Endereco;
import voll.med.api.medico.DadosCadastroMedicos;
import voll.med.api.medico.Medico;
import voll.med.api.medico.MedicoRepository;

@RestController
@RequestMapping("medicos")
public class MedicoController {


    // riando um atributo
    @Autowired // ingeção de dependencias
    private MedicoRepository medicoRepository;
    @PostMapping
    public void cadastrar( @RequestBody DadosCadastroMedicos json) {
        // salvando no mysql com spring jpa
        medicoRepository.save(new Medico(json));

    }
}
