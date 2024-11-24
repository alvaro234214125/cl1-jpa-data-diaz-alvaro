package pe.edu.i202224528.cl1_jpa_data_diaz_alvaro.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.edu.i202224528.cl1_jpa_data_diaz_alvaro.entity.Country;

import java.util.Optional;

@Repository
public interface CountryRepository extends CrudRepository<Country, String> {

    @Query("SELECT c FROM Country c LEFT JOIN FETCH c.countryLanguages LEFT JOIN FETCH c.cities WHERE c.Code = :code")
    Optional<Country> findByCodeWithDetails(String code);

}
