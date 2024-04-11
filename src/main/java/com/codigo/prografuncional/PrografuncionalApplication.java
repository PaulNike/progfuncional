package com.codigo.prografuncional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class PrografuncionalApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrografuncionalApplication.class, args);

		//FUNCIONAL
		//Lista de String
		List<String> lstMarcas = List.of("Mazda","Toyota","Nissan","Chevrolet","Jetour","Subaru", "Tesla");
		//lstMarcas.forEach( marca -> System.out.println(marca));

		//streams
		List<String> marcasFiltradas = lstMarcas.stream() //Convertir la lista a un Stream
				.filter( marca -> marca.startsWith("T")) // Filtrando a travez de predicate todos los elemetos que incien con T
				.map(String::toUpperCase) // Convertir todos los elementos de la coleccion a MAYUSCULAS con una fuction
				.toList(); //Recolectamos los resultados en otra lista

		marcasFiltradas.forEach(System.out::println); // Imprimo los valores de mi lsita filtrada



		//FORMA NORMAL
		System.out.println(" **************************************************** ");
		List<String> valoresFiltrados = new ArrayList<>();

		for (String nombre : lstMarcas) {

		}

		for (int i=0; i < lstMarcas.size();i++){
			if(lstMarcas.get(i).startsWith("T")){
				valoresFiltrados.add(lstMarcas.get(i).toUpperCase());

				//System.out.println("Valores Filtrados " + valoresFiltrados.);
			}
		}
		valoresFiltrados.forEach(System.out::println);





		//FORMA NORMAL
		/*for (int i=0; i < marcas.size();i++){
			System.out.println("Marca de Carro: " + marcas.get(i));
		}*/



	}

}
