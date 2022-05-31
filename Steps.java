package testes;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class Steps {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	@Given("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String site) {
		metodos.abrirNavegador(site, "acessando o navegador.");
	}

	@When("cliclar nos {string}")
	public void cliclar_nos(String elemento) {
		metodos.click(el.getBaz());
		metodos.click(el.getBar());
		metodos.click(el.getBar3());
        metodos.click(el.getEdit1());
        metodos.click(el.getDelete1());
        metodos.click(el.getEdit2());
        metodos.click(el.getDelete2());
        metodos.click(el.getEdit3());
        metodos.click(el.getDelete3());
        metodos.click(el.getEdit4());
        metodos.click(el.getDelete4());
        metodos.click(el.getEdit5());
        metodos.click(el.getDelete5());
        metodos.click(el.getEdit6());
        metodos.click(el.getDelete6());
        metodos.click(el.getEdit7());
        metodos.click(el.getDelete7());
        metodos.click(el.getEdit8());
        metodos.click(el.getDelete8());
        metodos.click(el.getEdit9());
        metodos.click(el.getDelete9());
        metodos.click(el.getEdit10());
        metodos.click(el.getDelete10());
		
	}

	@Then("finalizo o {string}")
	public void finalizo_o(String string) {
		metodos.fechaNavegador(string);
	}

}
