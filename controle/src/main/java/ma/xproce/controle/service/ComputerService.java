package ma.xproce.controle.service;

import ma.xproce.controle.dao.entities.Computer;
import ma.xproce.controle.dto.ComputerDto;

import java.util.List;

public interface ComputerService {

    public ComputerDto saveComputer(ComputerDto computerDto);

    public List<ComputerDto> getComputerByProce( String proce);


}
