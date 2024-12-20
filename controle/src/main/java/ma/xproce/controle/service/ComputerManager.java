package ma.xproce.controle.service;


import lombok.AllArgsConstructor;
import ma.xproce.controle.dao.entities.Computer;
import ma.xproce.controle.dto.ComputerDto;
import ma.xproce.controle.dao.repositories.ComputerRepository;
import ma.xproce.controle.mapper.ComputerMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ComputerManager implements ComputerService{

    private ComputerRepository computerRepository;
    private ComputerMapper computerMapper;

    @Override
    public ComputerDto saveComputer(ComputerDto computerDto) {
        Computer computer = computerMapper.fromComputerDtoToComputer(computerDto);
        computer = computerRepository.save(computer);
        computerDto = computerMapper.fromComputerToComputerDto(computer);
        return computerDto;

    }

    @Override
    public List<ComputerDto> getComputerByProce(String proce) {
        List<Computer> computers = computerRepository.findByProce( proce);
        List<ComputerDto> computerDtos = new ArrayList<>();
        for (Computer computer : computers) {
            computerDtos.add(computerMapper.fromComputerToComputerDto(computer));
        }
        return computerDtos;
    }
}
