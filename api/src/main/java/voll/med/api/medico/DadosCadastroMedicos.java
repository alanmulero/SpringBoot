package voll.med.api.medico;

import voll.med.api.endereco.DadosEndereco;

public record DadosCadastroMedicos(String nome, String email, String crm, Especialidades especialidades,
                                   DadosEndereco endereco) {
}
