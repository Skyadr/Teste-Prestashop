package homepage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

import Base.BaseTests;



public class HomePageTests extends BaseTests{
	
	@Test
	public void testContarProdutos_oitoProdutosDiferentes( ) {
		carregarPaginaInicial();
		assertThat(homePage.contarProdutos(), is(8));
	}

}
