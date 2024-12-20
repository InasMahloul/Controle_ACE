package ma.xproce.controle;

import ma.xproce.controle.dto.ComputerDto;
import ma.xproce.controle.service.ComputerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ControleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControleApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ComputerService computerService){
        return  args -> {
            computerService.saveComputer(
                    ComputerDto.builder()
                            .proce("Intel i7")
                            .ram("16GB")
                            .hardDrive("1TB SSD")
                            .price(1234.0)
                            .macAddress("00:1B:44:11:3A:B7")
                            .build()
            );


        };
    }

}
