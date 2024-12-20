package ma.xproce.controle.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Builder

public class Computer {

    @Id
    @GeneratedValue
    Long id_Pc;
    String proce;
    String ram;
    String hardDrive;
    Double price;
    String macAddress;

}
