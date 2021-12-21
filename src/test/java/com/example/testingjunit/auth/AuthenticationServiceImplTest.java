package com.example.testingjunit.auth;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class AuthenticationServiceImplTest {

    @Mock
    private UserRepository userRepository;

    private AuthenticationService authenticationService;

    @BeforeEach
    void setup(){
        authenticationService = new AuthenticationServiceImpl(userRepository);
    }

    @Test
    void createAccTest(){
        Mockito.when(userRepository.save("bobvu")).thenReturn(true);


        Assertions.assertEquals(authenticationService.createNewAccount("bobvu"), "Success");

    }
}