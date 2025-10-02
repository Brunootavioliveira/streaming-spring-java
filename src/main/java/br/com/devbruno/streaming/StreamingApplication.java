package br.com.devbruno.streaming;

import br.com.devbruno.streaming.service.ConsumoApi;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StreamingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StreamingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("http://www.omdbapi.com/?t=gilmore+girls&apikey=96159931");
		System.out.println(json);
		/* json = consumoApi.obterDados("https://coffee.alexflipnote.dev/random.json");
		System.out.println(json);
		Não importa o tipo da API, com uma classe especifica de consumo de api, vai conseguir gerar informação
		devolver em JSON */
	}
}
