package pe.edu.i202224528.cl1_jpa_data_diaz_alvaro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.i202224528.cl1_jpa_data_diaz_alvaro.entity.Country;
import pe.edu.i202224528.cl1_jpa_data_diaz_alvaro.repository.CountryRepository;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Cl1JpaDataDiazAlvaroApplication implements CommandLineRunner {

	@Autowired
	private CountryRepository countryRepository;

	public static void main(String[] args) {
		SpringApplication.run(Cl1JpaDataDiazAlvaroApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Optional<Country> argentinaOpt = countryRepository.findByCodeWithDetails("ARG");

		argentinaOpt.ifPresentOrElse(
				argentina -> {
					System.out.println("Lenguajes en Argentina:");
					argentina.getCountryLanguages().forEach(language ->
							System.out.println(language.getId().getLanguage())
					);
				},
				() -> {
					Optional<Country> peruOpt = countryRepository.findByCodeWithDetails("PER");
					peruOpt.ifPresentOrElse(
							peru -> {
								System.out.println("Lenguajes en Perú:");
								peru.getCountryLanguages().forEach(language ->
										System.out.println(language.getId().getLanguage())
								);
							},
							() -> System.out.println("No se encontraron los países")
					);
				}
		);

//		List<String> countryCodesToDelete = List.of("ARG", "COL");
//
//		countryCodesToDelete.forEach(code -> {
//			Optional<Country> countryOpt = countryRepository.findById(code);
//			if (countryOpt.isPresent()) {
//				System.out.println("Eliminando país: " + code);
//			} else {
//				System.out.println("País no encontrado.");
//			}
//		});
//
//		countryRepository.deleteAllById(countryCodesToDelete);
//
//		System.out.println("Eliminados");
	}

}

