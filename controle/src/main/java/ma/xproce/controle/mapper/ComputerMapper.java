package ma.xproce.controle.mapper;

import ma.xproce.controle.dao.entities.Computer;
import ma.xproce.controle.dto.ComputerDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;


@Component
public class ComputerMapper {

    private final ModelMapper mapper = new ModelMapper();
    public Computer fromComputerDtoToComputer(ComputerDto computerDto){
        return mapper.map(computerDto, Computer.class);
    }

    public ComputerDto fromComputerToComputerDto(Computer computer){
        return mapper.map(computer, ComputerDto.class);
    }
}
