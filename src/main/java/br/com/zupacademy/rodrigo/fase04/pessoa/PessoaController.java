package br.com.zupacademy.rodrigo.fase04.pessoa;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {
	
	
	@PostMapping
	public String cadastraPessoa(@RequestBody Pessoa pessoa) {
		return pessoa.toString();
	}

}
