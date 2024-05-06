package ma.enset.tpcassandra.services;

import ma.enset.tpcassandra.entities.User;
import ma.enset.tpcassandra.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public void createUser (String fname, String lname, int age){
        userRepository.save(new User(UUID.randomUUID(), fname, lname, age));
    }
    public User getUserById (UUID uuid){
        return userRepository.findById(uuid).get();
    }
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }


}
