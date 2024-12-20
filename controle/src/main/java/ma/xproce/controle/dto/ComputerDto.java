package ma.xproce.controle.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Builder
public class ComputerDto {

    String proce;
    String ram;
    String hardDrive;
    Double price;
    String macAddress;

}
