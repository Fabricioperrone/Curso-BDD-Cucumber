import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import cucumber.api.java.ca.Cal;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class AprenderCucumber {

	@Dado("^que criei o arquivo corretamente$")
	public void queCrieiOArquivoCorretamente() throws Throwable {
		System.out.println("Qualquer coisa");
	}

	@Quando("^executá-lo$")
	public void executáLo() throws Throwable {

	}

	@Então("^a especificação deve finalizar com sucesso$")
	public void aEspecificaçãoDeveFinalizarComSucesso() throws Throwable {

	}

	// Deve incrementar o contador
	private int contador = 0;

	@Dado("^que o  valor do contador é (\\d+)$")
	public void queOValorDoContadorÉ(int arg1) throws Throwable {
		contador = arg1;
	}

	@Quando("^eu incrementar em (\\d+)$")
	public void euIncrementarEm(int arg1) throws Throwable {
		contador = contador + arg1;
	}

	@Então("^o valor do contador será (\\d+)$")
	public void oValorDoContadorSerá(int arg1) throws Throwable {
		Assert.assertEquals(arg1, contador);
		
	}
	
	Date entrega = new Date();
	
	@Dado("^que a entrega é dia (\\d+)/(\\d+)/(\\d+)$")
	public void queAEntregaÉDia(int dia, int mes, int ano) throws Throwable {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, dia);
		cal.set(Calendar.MONTH, mes - 1);
		cal.set(Calendar.YEAR, ano);
		entrega = cal.getTime();
		
	}

	@Quando("^a entrega atrasar (\\d+) (dia|dias|mes|meses)$")
	public void aEntregaAtrasarEmDias(int arg1, String tempo) throws Throwable {
	    Calendar cal = Calendar.getInstance();
	    cal.setTime(entrega);
	    if (tempo.equals("dias")) {
	    	cal.add(Calendar.DAY_OF_MONTH, arg1);
	    	
	    }
	    if (tempo.equals("meses")) {
			cal.add(Calendar.MONTH, arg1);
			
		}
	    entrega = cal.getTime();
	}

	@Então("^a entrega será efetuada em (\\d{2}\\/\\d{2}\\/\\d{4})$")
	public void aEntregaSeráEfetuadaEm(String data) throws Throwable {
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String dataFormatada = format.format(entrega);
		Assert.assertEquals(data, dataFormatada);
	
	}
	
	@Dado("^que o ticket é AF(\\d+)$")
	public void que_o_ticket_é_AF(int arg1) throws Throwable {
	   
	}

	@Dado("^que o valor da passagem é R\\$ (\\d+),(\\d+)$")
	public void que_o_valor_da_passagem_é_R$(int arg1, int arg2) throws Throwable {
	   
	}

	@Dado("^que o nome do passageiro é \"(.*)\"$")
	public void que_o_nome_do_passageiro_é(String arg1) throws Throwable {
   
	}
	

	@Dado("^que o telefone do passageiro é (\\d+)-(\\d+)$")
	public void que_o_telefone_do_passageiro_é(int arg1, int arg2) throws Throwable {
	   
	}

	@Quando("^criar os steps$")
	public void criar_os_steps() throws Throwable {
		
	}
	    
	@Então("^o teste vai funcionar$")
	public void o_teste_vai_funcionar() throws Throwable {
	   
	}




}
