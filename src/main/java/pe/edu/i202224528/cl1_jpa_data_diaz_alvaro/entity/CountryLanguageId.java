package pe.edu.i202224528.cl1_jpa_data_diaz_alvaro.entity;

import jakarta.persistence.Column;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class CountryLanguageId {

    @Column(name = "CountryCode")
    private String CountryCode;

    @Column(name = "Language")
    private String Language;
}
