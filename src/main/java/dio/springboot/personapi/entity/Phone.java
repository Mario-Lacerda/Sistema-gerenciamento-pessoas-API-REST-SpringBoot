package dio.springboot.personapi.entity;


import dio.springboot.personapi.enums.PhoneType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING) //Home, Mobile ou Commercial
    @Column(nullable = false)
    private PhoneType type;

    @Column(nullable = false)
    private String number;
}
