package test.data.mn.adapter.rest;

import java.util.Optional;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import test.data.mn.domain.User;
import test.data.mn.domain.UserRepository;

@Controller("/users")
final class UserController {
    private final UserRepository repo;

    UserController(UserRepository repo) {
        this.repo = repo;
    }

    @Get("/{id}")
    Optional<User> get(long id) {
        return repo.findById(id);
    }
}
