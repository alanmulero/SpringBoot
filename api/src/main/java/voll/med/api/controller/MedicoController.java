package voll.med.api.controller;

import org.springframework.web.bind.annotation.*;
import voll.med.api.medico.DadosCadastroMedicos;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @PostMapping
    public void cadastrar( @RequestBody DadosCadastroMedicos json) {
        System.out.println(json);
    }
}
