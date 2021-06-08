package o.di.diora.utils;

import o.di.diora.dto.request.PersonDTO;
import o.di.diora.entity.Person;

import java.util.Collections;

public class PersonUtils {
    private static final String FIRST_NAME = "Joao";
    private static final String LAST_NAME = "Ninguem";
    private static final String CPF_NUMBER = "120.342.579-10";
    private static final long PERSON_ID = 1L;

    public static PersonDTO createFakeDTO() {
        return PersonDTO.builder()
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMBER)
                .phones(Collections.singletonList(PhoneUtils.createFakeDTO()))
                .build();
    }

    public static Person createFakeEntity() {
        return Person.builder()
                .id(PERSON_ID)
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMBER)
                .phones(Collections.singletonList(PhoneUtils.createFakeEntity()))
                .build();
    }
}
