package voll.med.api.controller;

import org.springframework.web.bind.annotation.*;
import voll.med.api.medico.DadosCadastroMedicos;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @PostMapping
    public void cadastrar( @RequestBody DadosCadastroMedicos json) {
        // salvando no mysql com spring jpa

        System.out.println(json);
    }
}
