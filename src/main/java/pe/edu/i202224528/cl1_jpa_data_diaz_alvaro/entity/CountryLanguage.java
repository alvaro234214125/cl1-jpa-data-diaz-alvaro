package pe.edu.i202224528.cl1_jpa_data_diaz_alvaro.entity;

import lombok.*;
import jakarta.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CountryLanguage {

    @EmbeddedId
    private CountryLanguageId id;

    private String IsOfficial;
    private double Percentage;

    @ManyToOne
    @MapsId("CountryCode")
    @JoinColumn(name = "CountryCode")
    private Country country;

}


