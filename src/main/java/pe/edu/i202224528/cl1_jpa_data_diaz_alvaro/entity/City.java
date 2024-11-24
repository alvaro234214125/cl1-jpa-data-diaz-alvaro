package pe.edu.i202224528.cl1_jpa_data_diaz_alvaro.entity;

import lombok.*;
import jakarta.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    private String Name;

    @ManyToOne
    @JoinColumn(name = "CountryCode")
    private Country country;

    private String District;
    private Integer Population;
}
