package molpadia_webapp.controller;


import molpadia_webapp.core.models.UserModel;
import molpadia_webapp.core.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    Iterable<UserModel> all() {
        return userRepository.findAll();
    }

    @PostMapping("/users")
    UserModel save(@RequestBody UserModel user) {
        return userRepository.save(user);
    }
}
