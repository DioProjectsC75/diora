package o.di.diora.service;

import o.di.diora.dto.request.PersonDTO;
import o.di.diora.dto.response.MessageResponseDTO;
import o.di.diora.entity.Person;
import o.di.diora.mapper.PersonMapper;
import o.di.diora.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService {
    private PersonRepository personRepository;

    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(PersonDTO personDTO) {
        Person savedPerson = personMapper.toModel(personDTO);
        return MessageResponseDTO
                .builder()
                .message("Created person with ID:" + savedPerson.getId())
                .build();
    }

    public List<PersonDTO> listAll() {
        List<Person> allPeople = personRepository.findAll();
        return allPeople
                .stream()
                .map(personMapper::toDTO)
                .collect(Collectors.toList());
    }
}
