package com.example.testingjunit.auth;


public class AuthenticationServiceImpl implements AuthenticationService {
    private final UserRepository userRepository;

    public AuthenticationServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public String createNewAccount(String username) {
        boolean isSuccess = userRepository.save("bobvu");

        return isSuccess ? "Success" : "False";

    }
}
