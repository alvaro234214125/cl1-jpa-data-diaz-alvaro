    package pe.edu.i202224528.cl1_jpa_data_diaz_alvaro.entity;

    import lombok.*;
    import jakarta.persistence.*;

    import java.util.Set;

    @Entity
    @Setter
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @ToString
    public class Country {

        @Id
        private String Code;
        private String Name;
        private String Continent;
        private String Region;
        private Double SurfaceArea;
        private Integer IndepYear;
        private Integer Population;
        private Double LifeExpectancy;
        private Double GNP;
        private Double GNPOld;
        private String LocalName;
        private String GovernmentForm;
        private String HeadOfState;
        private Integer Capital;
        private String Code2;

        @OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
        private Set<City> cities;

        @OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
        private Set<CountryLanguage> countryLanguages;
    }
